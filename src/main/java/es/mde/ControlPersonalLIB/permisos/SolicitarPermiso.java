package es.mde.ControlPersonalLIB.permisos;

import java.util.Date;

import es.mde.ControlPersonalLIB.ausencias.Ausencia;

public interface SolicitarPermiso {

	void solicitarDia(Date fechaInicio, Date fechaFin, Permiso permiso);
}
