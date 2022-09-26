package Definitions;

import Steps.consultaAlquilerCochesStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class consultaAlquilerCochesDefinition {
	
	@Steps
	consultaAlquilerCochesStep consultaAlquilerCochesStep;
	
	@Given("^El usuario ingresa a Booking\\.com$")
	public void el_usuario_ingresa_a_Booking_com() throws Throwable {
		consultaAlquilerCochesStep.open();
	}


	@When("^Abre el modulo de \"([^\"]*)\"$")
	public void abre_el_modulo_de(String arg1) throws Throwable {
		consultaAlquilerCochesStep.seleccionModulo();
	}

	@When("^Ingresa \"([^\"]*)\" en el punto de encuentro$")
	public void ingresa_en_el_punto_de_encuentro(String arg1) throws Throwable {
		consultaAlquilerCochesStep.ingresoDestino();
	}

	@When("^realiza click en boton \"([^\"]*)\"$")
	public void realiza_click_en_boton(String arg1) throws Throwable {
		consultaAlquilerCochesStep.seleccionBtnBuscar();
	}

	@Then("^Realiza validacion de consulta exitosa de disponibilidad de alquiler de autos$")
	public void realiza_validacion_de_consulta_exitosa_de_disponibilidad_de_alquiler_de_autos() throws Throwable {
		consultaAlquilerCochesStep.validacionConsultExitosa();
	}
}
