package es.mde.ControlPersonalLIB.personas;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import es.mde.ControlPersonalLIB.ausencias.Ausencia;
import es.mde.ControlPersonalLIB.ausencias.AusenciaImpl;
import es.mde.ControlPersonalLIB.permisos.Permiso;
import es.mde.ControlPersonalLIB.permisos.SolicitarPermiso;

public class PersonaConPermiso extends Persona implements SolicitarPermiso {

	private HashSet permiso;
	private List<Ausencia> ausencias;

	private int trienios;

	public int getTrienios() {
		return trienios;
	}

	public void setTrienios(int trienios) {
		this.trienios = trienios;
	}
	
	public HashSet getPermiso() {
		return permiso;
	}

	public List<Ausencia> getAusencias() {
		return ausencias;
	}

	public PersonaConPermiso() {
		super();
		this.permiso = new HashSet();
		this.ausencias = new ArrayList<>();
	}

	@Override
	public void solicitarDia(Date fechaInicio, Date fechaFin, Permiso permiso) {
		int diasSolicitados = fechaFin.compareTo(fechaInicio);
		int diasRestantes = permiso.getDiasRestantes();

		if (diasRestantes >= diasSolicitados) {
			permiso.setDiasRestantes(diasRestantes -= diasSolicitados);
			ausencias.add(new AusenciaImpl(fechaInicio, fechaFin));
		}

		
	}

}
