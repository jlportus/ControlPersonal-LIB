package es.mde.ControlPersonalLIB.gestor;

import java.time.Instant;
import java.util.Collection;

import es.mde.ControlPersonalLIB.ausencias.Ausencia;
import es.mde.ControlPersonalLIB.personas.Persona;
import es.mde.ControlPersonalLIB.personas.PersonaConPermiso;

public abstract class Gestor {

	public static Actividad generarListadoActividad(Instant fecha, Collection<PersonaConPermiso> listado) {
		Actividad listadoActividad = new Actividad();
		for (PersonaConPermiso personaConPermiso : listado) {
			if (isAsistente(personaConPermiso, fecha)) {
				listadoActividad.getListadoAsistentes().add(personaConPermiso);
			} else {
				listadoActividad.getListadoFaltasJustificadas().put(personaConPermiso,
						Gestor.getAusencia(personaConPermiso, fecha));
			}
		}

		return listadoActividad;
	}

	public static boolean isAsistente(PersonaConPermiso persona, Instant fecha) {
		boolean asiste = false;
		for (Ausencia a : persona.getAusencias()) {
			if (!a.isAutorizada() && fecha.isAfter(a.getFechaInicio()) && fecha.isBefore(a.getFechaFin())) {
				asiste = true;
				break;
			}
		}

		return asiste;
	}

	public static Ausencia getAusencia(PersonaConPermiso persona, Instant fecha) {
		Ausencia ausencia = null;
		for (Ausencia a : persona.getAusencias()) {
			if (!a.isAutorizada() && fecha.isAfter(a.getFechaInicio()) && fecha.isBefore(a.getFechaFin())) {
				ausencia = a;
			}
		}

		return ausencia;
	}
}
