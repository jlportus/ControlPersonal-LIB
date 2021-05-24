package es.mde.ControlPersonalLIB.personas;

public class PersonaConPermiso extends Persona implements Permiso {

	private int diasPermiso;
	private int diasVacaciones;
	private int trienios;

	public int getTrienios() {
		return trienios;
	}

	public void setTrienios(int trienios) {
		this.trienios = trienios;
	}

	public void setDiasPermiso(int diasPermiso) {
		this.diasPermiso = diasPermiso;//los dias de permiso se calcularan con respecto a los trienios y/o festivos locales (pueden ser un properties)
	}

	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones; //los dias de vacaciones se calcularan con respecto a los trienios
	}

	@Override
	public int getDiasPermiso() {
		return diasPermiso;
	}

	@Override
	public int getDiasVacaciones() {
		return diasVacaciones;
	}

	public PersonaConPermiso() {
		super();
	}
	
	

}
