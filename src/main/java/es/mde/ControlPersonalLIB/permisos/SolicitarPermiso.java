package es.mde.ControlPersonalLIB.permisos;

import java.time.Instant;

public interface SolicitarPermiso {

	void solicitarDia(Instant fechaInicio, Instant fechaFin, Permiso permiso);
}
