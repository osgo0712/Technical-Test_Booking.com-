package Steps;

import PageObject.consultaTaxisAeropuertoPageObject;

public class consultaTaxisAeropuertoStep {

	consultaTaxisAeropuertoPageObject consultaTaxisAeropuertoPageObject;
	
	public void open() {
		consultaTaxisAeropuertoPageObject.open();
	}
	
	public void seleccionModulo() {
		consultaTaxisAeropuertoPageObject.seleccionModulo();
	}
	
	public void ingresoUbicaciones() {
		consultaTaxisAeropuertoPageObject.ingresoUbicaciones();
	}
		
	public void confirmarConsulta() {
		consultaTaxisAeropuertoPageObject.confirmarConsulta();
	}
	
	public void validacionConsultExitosa() {
		consultaTaxisAeropuertoPageObject.validacionConsultExitosa();
	}
}
