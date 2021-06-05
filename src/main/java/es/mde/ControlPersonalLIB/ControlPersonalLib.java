package es.mde.ControlPersonalLIB;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;

import es.mde.ControlPersonalLIB.ausencias.Ausencia;
import es.mde.ControlPersonalLIB.ausencias.AusenciaImpl;
import es.mde.ControlPersonalLIB.gestor.Actividad;
import es.mde.ControlPersonalLIB.gestor.Gestor;
import es.mde.ControlPersonalLIB.permisos.Permiso;
import es.mde.ControlPersonalLIB.permisos.PermisoImpl;
import es.mde.ControlPersonalLIB.personas.PersonaConPermiso;

public class ControlPersonalLib {

	public static void main(String[] args) {
		
//		PersonaConPermiso persona1 = new PersonaConPermiso();
//		persona1.setNombre("paco");
//		PersonaConPermiso persona2 = new PersonaConPermiso();
//		persona2.setNombre("manolo");
//		PersonaConPermiso persona3 = new PersonaConPermiso();
//		persona3.setNombre("maria");
//		
//		Collection<PersonaConPermiso> listadoPersonas = new ArrayList<>();
//		
//		Instant fechaInicio = Instant.parse("2021-06-01T07:40:25.685565653Z");
//		Instant fechaFin= Instant.parse("2021-06-10T07:40:25.685565653Z");
//		Ausencia permiso1 = new AusenciaImpl(fechaInicio, fechaFin);
//		
//		
//		
//		System.out.println(fechaInicio);
//		
//		
//		fechaInicio = Instant.parse("2021-05-01T07:40:25.685565653Z");
//		fechaFin= Instant.parse("2021-05-10T07:40:25.685565653Z");
//		
//		Ausencia permiso2 = new AusenciaImpl(fechaInicio, fechaFin);
//		permiso1.setAutorizada(true);
//		permiso2.setAutorizada(true);;
//		Ausencia permiso3 = new AusenciaImpl();
//		Ausencia permiso4 = new AusenciaImpl();
//		
//		persona1.getAusencias().add(permiso1);
//		persona1.getAusencias().add(permiso2);
//		
//		
//		
//		listadoPersonas.add(persona1);
//		listadoPersonas.add(persona2);
//		listadoPersonas.add(persona3);
//		
//		listadoPersonas.forEach(System.out::println);
//		
//		Actividad actividad = Gestor.generarListadoActividad(Instant.parse("2021-05-02T07:40:25.685565653Z"),"IFM" , listadoPersonas);
//		System.out.println("Actividad = " + actividad.getActividad() + actividad.getMomentoControl());
//		System.out.println("Asisten:");
//		actividad.getListadoAsistentes().forEach(System.out::println);
//		System.out.println("Faltan = "+actividad.getListadoFaltasJustificadas());
		
		
	}

}
