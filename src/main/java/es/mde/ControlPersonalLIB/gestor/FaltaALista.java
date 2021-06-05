package es.mde.ControlPersonalLIB.gestor;

import es.mde.ControlPersonalLIB.personas.Persona;

public class FaltaALista {

	private Persona persona;
	private String motivo;
	private boolean justificada;

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public boolean isJustificada() {
		return justificada;
	}

	public void setJustificada(boolean justificada) {
		this.justificada = justificada;
	}

	public FaltaALista() {

	}

	@Override
	public String toString() {
		return "FaltaALista [persona=" + persona + ", motivo=" + motivo + ", justificada=" + justificada + "]";
	}
	
	
}
