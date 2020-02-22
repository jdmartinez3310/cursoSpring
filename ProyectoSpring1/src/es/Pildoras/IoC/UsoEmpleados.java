package es.Pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		// Creacion de objectos de tipo Empleado
		Empleados Empleado1 = new DirectorEmpleado();
		
		// Uso de los objetos creados
		System.out.println(Empleado1.getTareas());*/
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContent.xml");
		
		/*Empleados Juan =  contexto.getBean("miEmpleado",Empleados.class);
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());*/
		
		SecretarioEmpleado Maria =  contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		System.out.println(Maria.getTareas());
		
		System.out.println(Maria.getInforme());
		
		System.out.println("Email: "+ Maria.getEmail());
		System.out.println("Nombre Empresa: "+ Maria.getNombreEmpresa());
		
		contexto.close();
		
	}

}
