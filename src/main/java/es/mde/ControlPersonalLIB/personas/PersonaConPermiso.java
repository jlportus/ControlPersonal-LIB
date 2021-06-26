package es.mde.ControlPersonalLIB.personas;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import es.mde.ControlPersonalLIB.ausencias.Ausencia;
import es.mde.ControlPersonalLIB.ausencias.AusenciaImpl;
import es.mde.ControlPersonalLIB.ausencias.tipoAusencias.Servicio;
import es.mde.ControlPersonalLIB.gestor.FaltaALista;
import es.mde.ControlPersonalLIB.permisos.Permiso;
import es.mde.ControlPersonalLIB.permisos.SolicitarPermiso;

public class PersonaConPermiso extends Persona implements SolicitarPermiso {

	protected Collection<Permiso> permisos;
	private Collection<Ausencia> ausencias;
	private Collection<FaltaALista> faltas;
//	private int trienios;

	public Collection<Ausencia> getAusencias() {
		return ausencias;
	}

	public void setAusencias(Collection<Ausencia> ausencias) {
		this.ausencias = ausencias;
	}

	public Collection<Permiso> getPermisos() {
		return permisos;
	}

	public void setPermisos(Collection<Permiso> permisos) {
		this.permisos = permisos;
	}

	public Collection<FaltaALista> getFaltas() {
		return faltas;
	}

	public void setFaltas(Collection<FaltaALista> faltas) {
		this.faltas = faltas;
	}

//	public int getTrienios() {
//		return trienios;
//	}
//
//	public void setTrienios(int trienios) {
//		this.trienios = trienios;
//	}

	public PersonaConPermiso() {
		super();

		this.permisos = new ArrayList<>();
		this.ausencias = new ArrayList<>();
	}

	@Override
	public void solicitarDia(Instant fechaInicio, Instant fechaFin, Permiso permiso) {
		int diasSolicitados = fechaFin.compareTo(fechaInicio);
		int diasRestantes = permiso.getDiasRestantes();

		if (diasRestantes >= diasSolicitados) {
			permiso.setDiasRestantes(diasRestantes -= diasSolicitados);
			ausencias.add(new AusenciaImpl(fechaInicio, fechaFin));
		}

	}

	void addAusencia(Ausencia ausencia) {
		this.ausencias.add(ausencia);
		if (ausencia.getClass() == Servicio.class) {
			((Servicio) ausencia).comprobarSiGeneraDia(this);
		}
	}

	@Override
	public String toString() {
		return super.getNombre() + " [permisos=" + permisos + ", ausencias=" + ausencias;
	}

}
