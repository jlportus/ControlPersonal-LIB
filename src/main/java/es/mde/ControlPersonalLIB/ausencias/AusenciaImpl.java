package es.mde.ControlPersonalLIB.ausencias;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import es.mde.ControlPersonalLIB.personas.PersonaConPermiso;

public class AusenciaImpl implements Ausencia {

	

	private Instant fechaInicio;
	private Instant fechaFin;
	private boolean autorizada;
	private String motivo = "";
	private PersonaConPermiso persona;

	@Override
	public Instant getFechaInicio() {
		return this.fechaInicio;
	}

	@Override
	public Instant getFechaFin() {
		return this.fechaFin;
	}

	@Override
	public void setFechaInicio(Instant fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Override
	public void setFechaFin(Instant fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Override
	public boolean isAutorizada() {
		return autorizada;
	}

	public void setAutorizada(boolean autorizada) {
		this.autorizada = autorizada;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	@Override
	public String getMotivo() {
		return this.motivo;
	}

	@Override
	public void setPersona(PersonaConPermiso persona) {
		this.persona = persona;
	}

	public PersonaConPermiso getPersona() {
		return persona;
	}

	public AusenciaImpl() {
	}

	public AusenciaImpl(Instant fechaInicio, Instant fechaFin) {
		setFechaFin(fechaFin);
		setFechaInicio(fechaInicio);
	}

	@Override
	public String toString() {
		return "AusenciaImpl [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", autorizada=" + autorizada
				+ "]";
	}

	public static long calcularDuracion(Instant fechaInicio, Instant fechaFin) {
		return fechaInicio.until(fechaFin, ChronoUnit.DAYS);
	}
}
