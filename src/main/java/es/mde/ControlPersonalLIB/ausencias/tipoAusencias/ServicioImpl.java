package es.mde.ControlPersonalLIB.ausencias.tipoAusencias;

import java.time.Instant;

import es.mde.ControlPersonalLIB.ausencias.AusenciaImpl;
import es.mde.ControlPersonalLIB.permisos.PermisoImpl;
import es.mde.ControlPersonalLIB.permisos.tipoPermiso.TiposPermiso;
import es.mde.ControlPersonalLIB.personas.Persona;
import es.mde.ControlPersonalLIB.personas.PersonaConPermiso;

public class ServicioImpl extends AusenciaImpl implements Servicio {

	private TipoServicio tipo;

	@Override
	public String getTipo() {
		return tipo.toString();
	}

	@Override
	public void setTipo(String tipo) {
		if (tipo == TipoServicio.ORDEN.toString()) {
			this.setMotivo(TipoServicio.ORDEN.toString());
			this.tipo = TipoServicio.ORDEN;
		} else if (tipo == TipoServicio.SEGURIDAD.toString()) {
			this.setMotivo(TipoServicio.SEGURIDAD.toString());
			this.tipo = TipoServicio.SEGURIDAD;
		} else if (tipo == TipoServicio.SERVICIOS.toString()) {
			this.setMotivo(TipoServicio.SERVICIOS.toString());
			this.tipo = TipoServicio.SERVICIOS;
		}
	}

	public ServicioImpl() {
		super();
		this.setAutorizada(true);
	}

	public ServicioImpl(String tipo, Instant fechaInicio, Instant fechaFin, PersonaConPermiso persona) {
		this();
		setFechaFin(fechaFin);
		setFechaInicio(fechaInicio);
		this.setTipo(tipo);
		this.setMotivo(getTipo().toString());
		comprobarSiGeneraDia(persona);
	}

	
	
	@Override
	public void comprobarSiGeneraDia(PersonaConPermiso persona) {
		Long duracionLong = calcularDuracion(getFechaInicio(), getFechaFin());
		if (duracionLong >=1 && getTipo() == TipoServicio.SEGURIDAD.toString()  ) {
			generaDiaPermiso(persona);
		}  else if ( duracionLong >=2 && getTipo() == TipoServicio.ORDEN.toString()  ){
			generaDiaPermiso(persona);
		}
	}
	
	 void generaDiaPermiso(PersonaConPermiso persona) {
		persona.getPermisos().forEach(p -> {
			if (p.getTipo() == TiposPermiso.DESCANSO_ADICIONAL.toString()) {
				if (((PermisoImpl) p).getDiasPermisoCorresponden() >= 10) {
				} else {
					p.setDiasPermisoCorresponden(p.getDiasPermisoCorresponden() + 1);
				}
			}
		});
	}

}
