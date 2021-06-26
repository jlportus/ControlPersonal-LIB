package es.mde.ControlPersonalLIB.ausencias;

import java.time.Instant;

import es.mde.ControlPersonalLIB.personas.PersonaConPermiso;

public interface Ausencia {

	Instant getFechaInicio();

	Instant getFechaFin();

	void setFechaInicio(Instant fechaInicio);

	void setFechaFin(Instant fechaFin);

	boolean isAutorizada();

	void setAutorizada(boolean autorizada);

	String getMotivo();

	void setPersona(PersonaConPermiso persona);
}
