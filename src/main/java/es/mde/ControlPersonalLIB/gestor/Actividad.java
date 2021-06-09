package es.mde.ControlPersonalLIB.gestor;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import es.mde.ControlPersonalLIB.ausencias.Ausencia;
import es.mde.ControlPersonalLIB.personas.Persona;

public class Actividad {

	private Instant momentoControl;
	private Collection<Persona> listadoAsistentes;
	private Collection<FaltaALista> listadoFaltasJustificadas;
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

	public Collection<FaltaALista> getListadoFaltasJustificadas() {
		return listadoFaltasJustificadas;
	}

	public void setListadoFaltasJustificadas(Collection<FaltaALista> listadoFaltasJustificadas) {
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

	public Actividad() {
		listadoAsistentes = new ArrayList<>();
		listadoFaltasJustificadas = new ArrayList<>();
		faltasALista = new ArrayList<>();
	}

	public Actividad(Instant fecha, String actividad) {
		this();
		this.momentoControl = fecha;
		this.actividad = actividad;
	}

	@Override
	public String toString() {
		return "Actividad [actividad=" + actividad + ", momentoControl=" + momentoControl + ", listadoAsistentes="
				+ listadoAsistentes + ", listadoFaltasJustificadas=" + listadoFaltasJustificadas + ", faltasALista="
				+ faltasALista + "]";
	}
	
	
}
