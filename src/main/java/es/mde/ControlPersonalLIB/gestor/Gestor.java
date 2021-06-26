package es.mde.ControlPersonalLIB.gestor;

import java.time.Instant;
import java.util.Collection;
import java.util.List;

import es.mde.ControlPersonalLIB.ausencias.Ausencia;
import es.mde.ControlPersonalLIB.ausencias.AusenciaImpl;
import es.mde.ControlPersonalLIB.personas.PersonaConPermiso;

public abstract class Gestor {

	public static Actividad generarListadoActividad(Instant fecha, String actividad,
			List<PersonaConPermiso> listado) {
		Actividad listadoActividad = new Actividad(fecha, actividad);
		for (PersonaConPermiso personaConPermiso : listado) {
			if (!isAsistente(personaConPermiso, fecha)) {
				listadoActividad.getListadoAsistentes().add(personaConPermiso);
			} else {

				listadoActividad.getListadoFaltasJustificadas().add(
						new FaltaALista(personaConPermiso, getAusencia(personaConPermiso, fecha).getMotivo(), true));
			}
		}

		return listadoActividad;
	}

	public static boolean isAsistente(PersonaConPermiso persona, Instant fecha) {
		boolean asiste = false;
		for (Ausencia a : persona.getAusencias()) {
			if (a.isAutorizada() && fecha.isAfter(a.getFechaInicio()) && fecha.isBefore(a.getFechaFin())) {
				asiste = true;
				break;
			}
		}

		return asiste;
	}

	public static Ausencia getAusencia(PersonaConPermiso persona, Instant fecha) {
		Ausencia ausencia = new AusenciaImpl();
		for (Ausencia a : persona.getAusencias()) {
			if (!a.isAutorizada() && fecha.isAfter(a.getFechaInicio()) && fecha.isBefore(a.getFechaFin())) {
				ausencia = a;
			}
		}

		return ausencia;
	}
}
