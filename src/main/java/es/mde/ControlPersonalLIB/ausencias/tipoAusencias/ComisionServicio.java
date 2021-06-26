package es.mde.ControlPersonalLIB.ausencias.tipoAusencias;

import java.time.Instant;

import es.mde.ControlPersonalLIB.ausencias.AusenciaImpl;

public class ComisionServicio extends AusenciaImpl {

	private String lugar;
	
	public String getLugar() {
		return lugar;
	}
	
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	public ComisionServicio() {
		super();
	}

	public ComisionServicio(Instant fechaInicio, Instant fechaFin, String lugar) {
		super(fechaInicio, fechaFin);
		setLugar(lugar);
	}
	
	
}
