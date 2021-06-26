package es.mde.ControlPersonalLIB.ausencias.tipoAusencias;

import java.time.Instant;

import es.mde.ControlPersonalLIB.ausencias.AusenciaImpl;

public class ComisionServicioImpl extends AusenciaImpl implements ComisionServicio {

	private String lugar;
	
	@Override
	public String getLugar() {
		return lugar;
	}
	
	@Override
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	public ComisionServicioImpl() {
		super();
	}

	public ComisionServicioImpl(Instant fechaInicio, Instant fechaFin, String lugar) {
		super(fechaInicio, fechaFin);
		setLugar(lugar);
	}
	
	
}
