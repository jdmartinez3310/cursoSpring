package es.Pildoras.pruebaAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ComercialExperimentado implements Empleados {
	
	/*@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/
	
	@Autowired
	@Qualifier("informeFinancieroTrim3")
	private CreacionInformeFinanciero nuevoInforme;
	
	
	/*public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender mas";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		//return "Esto es un informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero();
	}

}
