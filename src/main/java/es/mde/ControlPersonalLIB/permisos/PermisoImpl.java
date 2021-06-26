package es.mde.ControlPersonalLIB.permisos;

public class PermisoImpl implements Permiso {

	private int diasPermisoCorresponden;
	private int diasPermisoRestantes;
	private String tipo;

	@Override
	public int getDiasPermisoCorresponden() {
		return diasPermisoCorresponden;
	}

	@Override
	public void setDiasPermisoCorresponden(int diasPermisoCorresponden) {
		this.diasPermisoCorresponden = diasPermisoCorresponden;
	}

	@Override
	public int getDiasRestantes() {

		return diasPermisoRestantes;
	}

	@Override
	public void setDiasRestantes(int dias) {
		this.diasPermisoRestantes = dias;
	}

	@Override
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public PermisoImpl() {

	}

	

}
