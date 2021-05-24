package es.mde.ControlPersonalLIB.personas;

public class Persona {

	private String nombre;
	private String identificador;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public Persona() {

	}

	public Persona(String nombre, String identificador) {
		super();
		this.nombre = nombre;
		this.identificador = identificador;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", identificador=" + identificador + "]";
	}

	
	
}
