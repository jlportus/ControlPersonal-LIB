package es.mde.ControlPersonalLIB.ausencias;

import java.util.Date;

public interface SolicitarPermiso {

	Ausencia solicitarDia(Date fechaInicio, Date fechaFin, TipoPermiso t);
}
