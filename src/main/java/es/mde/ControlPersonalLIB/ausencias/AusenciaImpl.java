package es.mde.ControlPersonalLIB.ausencias;

import java.time.Instant;

public class AusenciaImpl implements Ausencia {

	private Instant fechaInicio;
	private Instant fechaFin;
	private boolean autorizada;

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

	
}
