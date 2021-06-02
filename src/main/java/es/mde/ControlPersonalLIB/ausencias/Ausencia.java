package es.mde.ControlPersonalLIB.ausencias;

import java.util.Date;

public interface Ausencia {

	Date getFechaInicio();
	Date getFechaFin();
	void setFechaInicio(Date fechaInicio);
	void setFechaFin(Date fechaFin);
	boolean isAutorizada();
	
}
