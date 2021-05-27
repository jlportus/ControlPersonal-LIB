package es.mde.ControlPersonalLIB.permisos;

public class PermisoImpl implements Permiso {

	private int diasPermisoCorresponden;
	private int diasPermisoRestantes;

	@Override
	public int getDiasPermisoCorresponden() {
		return diasPermisoCorresponden;
	}
	
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

	public PermisoImpl() {
		
	}
}
