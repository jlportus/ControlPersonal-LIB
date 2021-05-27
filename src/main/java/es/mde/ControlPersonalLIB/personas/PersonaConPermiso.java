package es.mde.ControlPersonalLIB.personas;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import es.mde.ControlPersonalLIB.ausencias.Ausencia;
import es.mde.ControlPersonalLIB.ausencias.AusenciaImpl;
import es.mde.ControlPersonalLIB.ausencias.SolicitarPermiso;
import es.mde.ControlPersonalLIB.ausencias.TipoPermiso;

public class PersonaConPermiso extends Persona implements Permiso, SolicitarPermiso {

	private int diasPermiso;
	private int diasPermisoActuales;
	private int diasVacaciones;
	private int diasVacacionesActuales;
	
	Map<TipoPermiso, Integer> permiso;
	
	private int trienios;

	public int getTrienios() {
		return trienios;
	}

	public void setTrienios(int trienios) {
		this.trienios = trienios;
	}

	public void setDiasPermiso(int diasPermiso) {
		this.diasPermiso = diasPermiso;// los dias de permiso se calcularan con respecto a los trienios y/o festivos
										// locales (pueden ser un properties)
	}

	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones; // los dias de vacaciones se calcularan con respecto a los trienios
	}

	@Override
	public int getDiasPermiso() {
		return diasPermiso;
	}

	@Override
	public int getDiasVacaciones() {
		return diasVacaciones;
	}

	public PersonaConPermiso() {
		super();
	}

	@Override
	public Ausencia solicitarDia(Date fechaInicio, Date fechaFin , TipoPermiso t) {
		int diasSolicitados = fechaFin.compareTo(fechaInicio);
		Ausencia ausencia = null;

		if (diasPermisoActuales > diasSolicitados) {
			diasPermisoActuales -= diasSolicitados;
			ausencia = new AusenciaImpl(fechaInicio, fechaFin);
		}

		return ausencia;
	}

	public Map<TipoPermiso, Integer> getPermiso() {
		permiso = new HashMap<>();
		
		return permiso;
	}

	public void setPermiso(Map<TipoPermiso, Integer> permiso) {
		this.permiso = permiso;
	}

	

}
