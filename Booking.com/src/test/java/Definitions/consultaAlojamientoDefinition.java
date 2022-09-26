package Definitions;

import Steps.consultaAlojamientoStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class consultaAlojamientoDefinition {

	@Steps
	consultaAlojamientoStep consultaAlojamientoStep;
	
	@Given("^El usuario abre la pagina de Booking\\.com$")
	public void el_usuario_abre_la_pagina_de_Booking_com() throws Throwable {   
		consultaAlojamientoStep.open();
	}

	@When("^Ingresa al modulo de \"([^\"]*)\"$")
	public void ingresa_al_modulo_de(String arg1) throws Throwable {
		consultaAlojamientoStep.seleccionModulo();
	}

	@When("^Ingresa \"([^\"]*)\" en el campo de ciudad$")
	public void ingresa_en_el_campo_de_ciudad(String arg1) throws Throwable {
		consultaAlojamientoStep.ingresoCiudadAlojamiento();
	}

	@When("^Realiza seleccion de \"([^\"]*)\" y \"([^\"]*)\"$")
	public void realiza_seleccion_de_y(String arg1, String arg2) throws Throwable {
		consultaAlojamientoStep.ingresoFechas();
	}

	@When("^Hace click en boton \"([^\"]*)\"$")
	public void hace_click_en_boton(String arg1) throws Throwable {
		consultaAlojamientoStep.confirmarConsulta();
	}

	@Then("^Realiza validacion de consulta exitosa$")
	public void realiza_validacion_de_consulta_exitosa() throws Throwable {
		consultaAlojamientoStep.validacionConsulta();
	}
}
