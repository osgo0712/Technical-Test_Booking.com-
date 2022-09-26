package Steps;

import java.io.FileNotFoundException;
import java.io.IOException;

import PageObject.consultaAlojamientoPageObject;

public class consultaAlojamientoStep {

	consultaAlojamientoPageObject consultaAlojamientoPageObject;
	
	public void open() {
		consultaAlojamientoPageObject.open();
	}
	
	public void seleccionModulo() {
		consultaAlojamientoPageObject.seleccionModulo();
	}
	
	public void ingresoCiudadAlojamiento() {
		consultaAlojamientoPageObject.ingresoCiudadAlojamiento();
	}
	
	public void ingresoFechas() {
		consultaAlojamientoPageObject.ingresoFechas();
	}
	
	public void confirmarConsulta() {
		consultaAlojamientoPageObject.confirmarConsulta();
	}
	
	public void validacionConsulta() {
		consultaAlojamientoPageObject.validacionConsultExitosa();
	}
}
