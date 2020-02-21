package es.Pildoras.IoC;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Creacion de objectos de tipo Empleado
		Empleados Empleado1 = new DirectorEmpleado();
		
		// Uso de los objetos creados
		System.out.println(Empleado1.getTareas());
	}

}
