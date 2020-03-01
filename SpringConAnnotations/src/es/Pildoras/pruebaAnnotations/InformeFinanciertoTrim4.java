package es.Pildoras.pruebaAnnotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciertoTrim4 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentación de informe de cierre de año";
	}

}
