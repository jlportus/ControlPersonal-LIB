package es.mde.ControlPersonalLIB.ausencias.tipoAusencias;

import java.time.Instant;

import es.mde.ControlPersonalLIB.ausencias.AusenciaImpl;

public class BajaImpl extends AusenciaImpl implements Baja {

	private String baja;
	
	@Override
	public String getBaja() {
		return baja;
	}
	
	@Override
	public void setBaja(String baja) {
		this.baja = baja;
	}
	
	public BajaImpl() {
		super();
	}

	public BajaImpl(Instant fechaInicio, Instant fechaFin, String baja) {
		super(fechaInicio, fechaFin);
		setBaja(baja);
	}
	
	
}
