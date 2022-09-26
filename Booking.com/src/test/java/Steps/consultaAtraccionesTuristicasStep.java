package Steps;

import PageObject.consultaAtraccionesTuristicasPaeObject;

public class consultaAtraccionesTuristicasStep {
	
	consultaAtraccionesTuristicasPaeObject consultaAtraccionesTuristicasPaeObject;

	public void open() {
		consultaAtraccionesTuristicasPaeObject.open();
	}
	
	public void seleccionModulo() {
		consultaAtraccionesTuristicasPaeObject.seleccionModulo();
	}
	
	public void ingresoSitioTuristico() {
		consultaAtraccionesTuristicasPaeObject.ingresoSitioTuristico();
	}
		
	public void ingresoFechas() {
		consultaAtraccionesTuristicasPaeObject.ingresoFechas();
	}
	
	public void confirmarConsulta() {
		consultaAtraccionesTuristicasPaeObject.confirmarConsulta();
	}
	
	public void validacionConsultExitosa() {
		consultaAtraccionesTuristicasPaeObject.validacionConsultExitosa();
	}

}
