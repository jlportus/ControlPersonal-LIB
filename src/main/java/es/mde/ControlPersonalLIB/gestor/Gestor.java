package es.mde.ControlPersonalLIB.gestor;

import java.sql.Date;
import java.util.Collection;

import es.mde.ControlPersonalLIB.ausencias.Ausencia;
import es.mde.ControlPersonalLIB.personas.Persona;
import es.mde.ControlPersonalLIB.personas.PersonaConPermiso;

public abstract class Gestor {

//	private Collection<Persona> presentes;
//	private Collection<Persona> faltasALista;
	public static ListadoActividad generarListadoActividad(Date fecha, Collection<PersonaConPermiso> listado) {
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

	public static boolean isAsistente(PersonaConPermiso persona, Date fecha) {
		boolean asiste = false;
		for (Ausencia p : persona.getAusencias()) {
			if (!p.isAutorizada() && fecha.after(p.getFechaInicio()) && fecha.before(p.getFechaFin())) {
				asiste = true;
				break;
			}
		}

		return asiste;
	}
}
