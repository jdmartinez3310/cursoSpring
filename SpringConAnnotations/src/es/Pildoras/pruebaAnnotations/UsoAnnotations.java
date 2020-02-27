package es.Pildoras.pruebaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Leer el xml de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContent.xml");
		
		// Pedir un bean al contenedor
		Empleados Antonio = contexto.getBean("comercialExperimentado", Empleados.class);
		
		// usar el bean
		System.out.println(Antonio.getInforme());
		
		System.out.println(Antonio.getTareas());
		
		// cerrar el contexto
		contexto.close();
		
	}
	
}