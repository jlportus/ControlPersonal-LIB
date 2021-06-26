package es.mde.ControlPersonalLIB.permisos.tipoPermiso;

import es.mde.ControlPersonalLIB.permisos.PermisoImpl;

public class DescansoAdicional extends PermisoImpl{
	
	public DescansoAdicional() {
		super();
		this.setTipo(TiposPermiso.DESCANSO_ADICIONAL.toString());
	}

}
