package Steps;

import PageObject.consultaDisponibilidadVuelosPageObject;

public class consultaDisponibilidadVuelosStep {
	
	consultaDisponibilidadVuelosPageObject consultaDisponibilidadVuelosPageObject;

	public void open() {
		consultaDisponibilidadVuelosPageObject.open();
	}
	
	public void seleccionModulo() {
		consultaDisponibilidadVuelosPageObject.seleccionModulo();
	}
	
	public void ingresoCiudadAlojamiento() {
		consultaDisponibilidadVuelosPageObject.ingresoDestinoVuelos();
	}
		
	public void confirmarConsulta() {
		consultaDisponibilidadVuelosPageObject.confirmarConsulta();
	}
	
	public void validacionConsultExitosa() {
		consultaDisponibilidadVuelosPageObject.validacionConsultExitosa();
	}

}
