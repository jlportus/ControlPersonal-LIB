package es.mde.ControlPersonalLIB.personas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import es.mde.ControlPersonalLIB.ausencias.Ausencia;
import es.mde.ControlPersonalLIB.ausencias.AusenciaImpl;
import es.mde.ControlPersonalLIB.permisos.Permiso;
import es.mde.ControlPersonalLIB.permisos.SolicitarPermiso;

public class PersonaConPermiso extends Persona implements SolicitarPermiso {

	protected Collection<Permiso> permiso;

	private Collection<Ausencia> ausencias;

	private int trienios;

	public Collection<Permiso> getPermiso() {
		return permiso;
	}

	public void setPermiso(Collection<Permiso> permiso) {
		this.permiso = permiso;
	}

	public Collection<Ausencia> getAusencias() {
		return ausencias;
	}

	public void setAusencias(Collection<Ausencia> ausencias) {
		this.ausencias = ausencias;
	}

	public int getTrienios() {
		return trienios;
	}

	public void setTrienios(int trienios) {
		this.trienios = trienios;
	}

	public PersonaConPermiso() {
		super();

		this.permiso = new ArrayList<>();
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
