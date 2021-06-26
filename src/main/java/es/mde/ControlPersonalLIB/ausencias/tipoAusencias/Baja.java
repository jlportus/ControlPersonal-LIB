package es.mde.ControlPersonalLIB.ausencias.tipoAusencias;

import java.time.Instant;

import es.mde.ControlPersonalLIB.ausencias.AusenciaImpl;

public class Baja extends AusenciaImpl {

	private String baja;
	
	public String getBaja() {
		return baja;
	}
	
	public void setBaja(String baja) {
		this.baja = baja;
	}
	
	public Baja() {
		super();
	}

	public Baja(Instant fechaInicio, Instant fechaFin, String baja) {
		super(fechaInicio, fechaFin);
		setBaja(baja);
	}
	
	
}
