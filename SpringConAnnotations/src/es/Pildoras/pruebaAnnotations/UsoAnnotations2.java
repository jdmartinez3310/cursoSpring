package es.Pildoras.pruebaAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Leer el xml de configuración
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContent.xml");
		
		// leer el class de configuración
		//AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class) ;
		
		// Leer el class de configuracion desde archivo.
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class); 
		
		
		
		// Pedir un bean al contenedor
		//Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
		DirectorFinanciero empleado = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		
		// Apuntan al mismo objeto
			System.out.println("Email del director: " + empleado.getEmail());
			System.out.println("Nombre de la empresa: " + empleado.getNombreEmpresa());
		
			System.out.println(empleado.getTareas());
			System.out.println(empleado.getInforme());
		
		
		contexto.close();
		
	}

}
