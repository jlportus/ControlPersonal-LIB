package es.mde.ControlPersonalLIB.ausencias.tipoAusencias;

import es.mde.ControlPersonalLIB.personas.PersonaConPermiso;

public interface Servicio {

	TipoServicio getTipo();

	void setTipo(String tipo);

	void comprobarSiGeneraDia(PersonaConPermiso persona);

}