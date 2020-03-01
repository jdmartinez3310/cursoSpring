package es.Pildoras.pruebaAnnotations;

import org.springframework.stereotype.Component;

@Component
public class InfomeFinancieroTrim1 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe financiero del trimestre 1";
	}

}
