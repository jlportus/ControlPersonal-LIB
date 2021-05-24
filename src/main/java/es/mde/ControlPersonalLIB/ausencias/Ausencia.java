package es.mde.ControlPersonalLIB.ausencias;

import java.time.Instant;

public interface Ausencia {

	Instant getFechaInicio();
	Instant getFechaFin();
	Instant setFechaInicio();
	Instant setFechaFin();
	
}
