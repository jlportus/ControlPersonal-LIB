package es.mde.ControlPersonalLIB.gestor;

import java.time.Instant;
import java.util.Collection;

import es.mde.ControlPersonalLIB.ausencias.Ausencia;
import es.mde.ControlPersonalLIB.personas.PersonaConPermiso;

public abstract class Gestor {

	public static ListadoActividad generarListadoActividad(Instant fecha, Collection<PersonaConPermiso> listado) {
		ListadoActividad listadoActividad = new ListadoActividad();
		for (PersonaConPermiso personaConPermiso : listado) {
			if (isAsistente(personaConPermiso, fecha)) {
				listadoActividad.getListadoAsistentes().add(personaConPermiso);
			} else {
				listadoActividad.getListadoFaltasJustificadas().add(personaConPermiso);
			}
		}

		return listadoActividad;
	}

	public static boolean isAsistente(PersonaConPermiso persona, Instant fecha) {
		boolean asiste = false;
		for (Ausencia p : persona.getAusencias()) {
			if (!p.isAutorizada() && fecha.isAfter(p.getFechaInicio()) && fecha.isBefore(p.getFechaFin())) {
				asiste = true;
				break;
			}
		}

		return asiste;
	}
}
