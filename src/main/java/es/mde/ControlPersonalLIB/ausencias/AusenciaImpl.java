package es.mde.ControlPersonalLIB.ausencias;

import java.util.Date;

public class AusenciaImpl implements Ausencia {

	private Date fechaInicio;
	private Date fechaFin;
	private boolean autorizada;

	@Override
	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	@Override
	public Date getFechaFin() {
		return this.fechaFin;
	}

	@Override
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Override
	public void setFechaFin(Date fechaFin) {
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

	public AusenciaImpl(Date fechaInicio, Date fechaFin) {
		setFechaFin(fechaFin);
		setFechaInicio(fechaInicio);
	}

}
