package es.mde.ControlPersonalLIB.permisos;

public interface Permiso {

	int getDiasPermisoCorresponden();
	int getDiasRestantes();
	void setDiasRestantes(int dias);
}
