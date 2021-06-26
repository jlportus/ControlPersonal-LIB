package es.mde.ControlPersonalLIB.ausencias.tipoAusencias;

import java.time.Instant;

import es.mde.ControlPersonalLIB.ausencias.AusenciaImpl;
import es.mde.ControlPersonalLIB.permisos.Permiso;
import es.mde.ControlPersonalLIB.permisos.PermisoImpl;
import es.mde.ControlPersonalLIB.permisos.tipoPermiso.TiposPermiso;
import es.mde.ControlPersonalLIB.personas.PersonaConPermiso;

public class PermisoOficialImpl extends AusenciaImpl implements PermisoOficial {

	private String tipo;

	@Override
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo == TiposPermiso.ASUNTOS_PROPIOS.toString()) {
			this.setMotivo(TiposPermiso.ASUNTOS_PROPIOS.toString());

		} else if (tipo == TiposPermiso.VACACIONES.toString()) {
			this.setMotivo(TiposPermiso.VACACIONES.toString());

		} else if (tipo == TiposPermiso.DESCANSO_ADICIONAL.toString()) {
			this.setMotivo(TiposPermiso.DESCANSO_ADICIONAL.toString());

		} else if (tipo == TiposPermiso.DESCANSO_PREPARACION.toString()) {
			this.setMotivo(TiposPermiso.DESCANSO_PREPARACION.toString());

		} else if (tipo == TiposPermiso.DESCANSO_OBLIGATORIO.toString()) {
			this.setMotivo(TiposPermiso.DESCANSO_OBLIGATORIO.toString());

		}
		this.tipo = this.getTipo();
	}

	public PermisoOficialImpl() {
		super();

	}

	public PermisoOficialImpl(String tipo, Instant fechaInicio, Instant fechaFin, PersonaConPermiso persona) {
		this();
		setFechaFin(fechaFin);
		setFechaInicio(fechaInicio);
		this.setTipo(tipo);
		this.setMotivo(getTipo().toString());
		controlMaximoDias(persona);

	}

	void controlMaximoDias(PersonaConPermiso persona) {
		persona.getPermisos().forEach(p -> {
			if (p.getTipo() == this.getTipo().toString()) {
				if (calcularDuracion(getFechaInicio(), getFechaFin()) <= p.getDiasRestantes()) {
					descontarDias(p);
				} else {
					this.setAutorizada(false);
					System.out.println("No le quedan dias suficientes");
				}
			}
		});
	}

	void descontarDias(Permiso permiso) {
		permiso.setDiasRestantes(
				(int) (permiso.getDiasRestantes() - calcularDuracion(getFechaInicio(), getFechaFin())));
	}

}
