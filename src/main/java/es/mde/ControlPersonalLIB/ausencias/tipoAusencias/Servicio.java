package es.mde.ControlPersonalLIB.ausencias.tipoAusencias;

import es.mde.ControlPersonalLIB.personas.PersonaConPermiso;

public interface Servicio {

	String getTipo();

	void setTipo(String tipo);

	void comprobarSiGeneraDia(PersonaConPermiso persona);

}