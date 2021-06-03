package es.mde.ControlPersonalLIB.ausencias;

import java.time.Instant;

public interface Ausencia {

	Instant getFechaInicio();
	Instant getFechaFin();
	void setFechaInicio(Instant fechaInicio);
	void setFechaFin(Instant fechaFin);
	boolean isAutorizada();
	
}
