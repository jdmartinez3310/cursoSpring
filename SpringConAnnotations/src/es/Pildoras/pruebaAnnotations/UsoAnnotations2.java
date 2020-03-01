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
		Empleados Antonio = contexto.getBean("comercialExperimentado", Empleados.class);
		
		Empleados Lucia = contexto.getBean("comercialExperimentado", Empleados.class);
		
		// Apuntan al mismo objeto
		if(Antonio == Lucia) {
			System.out.println("Apunta al mismo lugar en memoria");
			System.out.println(Antonio + "\n" + Lucia);
		} else {
			System.out.println("No apuntan al mismo lugar en memoria");
			System.out.println(Antonio + "\n" + Lucia);
		}
		
		contexto.close();
		
	}

}
