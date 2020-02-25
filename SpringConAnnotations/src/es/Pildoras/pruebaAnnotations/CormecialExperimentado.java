package es.Pildoras.pruebaAnnotations;

import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class CormecialExperimentado implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender mas";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Esto es un informe generado por el comercial";
	}

}
