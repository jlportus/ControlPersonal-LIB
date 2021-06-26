package es.mde.ControlPersonalLIB.permisos;

public interface Permiso {

	int getDiasPermisoCorresponden();
	void setDiasPermisoCorresponden(int diasPermisoCorresponden);
	int getDiasRestantes();
	void setDiasRestantes(int dias);
	String getTipo();
}
