package es.mde.ControlPersonalLIB.ausencias.tipoAusencias;

import es.mde.ControlPersonalLIB.permisos.tipoPermiso.TiposPermiso;

public interface PermisoOficial {

	TiposPermiso getTipo();

	void setTipo(String tipo);

}