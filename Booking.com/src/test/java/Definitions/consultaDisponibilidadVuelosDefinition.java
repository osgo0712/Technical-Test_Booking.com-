package Definitions;

import Steps.consultaDisponibilidadVuelosStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class consultaDisponibilidadVuelosDefinition {
	
	@Steps
	consultaDisponibilidadVuelosStep consultaDisponibilidadVuelosStep;

	@Given("^El usuario ingresa a la pagina de Booking\\.com$")
	public void el_usuario_ingresa_a_la_pagina_de_Booking_com() throws Throwable {
		consultaDisponibilidadVuelosStep.open();
	}


	@When("^Hace click en el modulo de \"([^\"]*)\"$")
	public void hace_click_en_el_modulo_de(String arg1) throws Throwable {
		consultaDisponibilidadVuelosStep.seleccionModulo();
	}

	@When("^Ingresa \"([^\"]*)\" en el campo destino de vuelo$")
	public void ingresa_en_el_campo_destino_de_vuelo(String arg1) throws Throwable {
		consultaDisponibilidadVuelosStep.ingresoCiudadAlojamiento();
	}

	@When("^Selecciona boton \"([^\"]*)\"$")
	public void selecciona_boton(String arg1) throws Throwable {
		consultaDisponibilidadVuelosStep.confirmarConsulta();
	}

	@Then("^Hace validacion de consulta exitosa$")
	public void hace_validacion_de_consulta_exitosa() throws Throwable {
		consultaDisponibilidadVuelosStep.validacionConsultExitosa();
	}
	
}
