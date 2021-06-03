package es.mde.ControlPersonalLIB.gestor;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import es.mde.ControlPersonalLIB.personas.Persona;

public class ListadoActividad {

	private Instant momentoControl;
	private Collection<Persona> listadoAsistentes;
	private Collection<Persona> listadoFaltasJustificadas;
	private Collection<FaltaALista> faltasALista;
	private String actividad;

	public Instant getMomentoControl() {
		return momentoControl;
	}

	public void setMomentoControl(Instant momentoControl) {
		this.momentoControl = momentoControl;
	}

	public Collection<Persona> getListadoAsistentes() {
		return listadoAsistentes;
	}

	public void setListadoAsistentes(Collection<Persona> listadoAsistentes) {
		this.listadoAsistentes = listadoAsistentes;
	}

	public Collection<Persona> getListadoFaltasJustificadas() {
		return listadoFaltasJustificadas;
	}

	public void setListadoFaltasJustificadas(Collection<Persona> listadoFaltasJustificadas) {
		this.listadoFaltasJustificadas = listadoFaltasJustificadas;
	}

	public Collection<FaltaALista> getFaltasALista() {
		return faltasALista;
	}

	public void setFaltasALista(Collection<FaltaALista> faltasALista) {
		this.faltasALista = faltasALista;
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public ListadoActividad() {
		listadoAsistentes = new ArrayList<>();
		listadoFaltasJustificadas = new ArrayList<>();
		faltasALista = new ArrayList<>();
	}

}
