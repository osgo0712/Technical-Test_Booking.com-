package Definitions;

import Steps.consultaTaxisAeropuertoStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class consultaTaxisAeropuertoDefinition {
	
	@Steps
	consultaTaxisAeropuertoStep consultaTaxisAeropuertoStep;

	@Given("^El usuario ingresa al home de la pagina de Booking\\.com!$")
	public void el_usuario_ingresa_al_home_de_la_pagina_de_Booking_com() throws Throwable {
		consultaTaxisAeropuertoStep.open();
	}

	@When("^Hace click en el modulo de \"([^\"]*)\"!$")
	public void hace_click_en_el_modulo_de(String arg1) throws Throwable {
		consultaTaxisAeropuertoStep.seleccionModulo();
	}

	@When("^Ingresa \"([^\"]*)\" en el campo \"([^\"]*)\"! y \"([^\"]*)\" en el campo \"([^\"]*)\"!$")
	public void ingresa_en_el_campo_y_en_el_campo(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		consultaTaxisAeropuertoStep.ingresoUbicaciones();
	}

	@When("^Selecciona boton \"([^\"]*)\"!$")
	public void selecciona_boton(String arg1) throws Throwable {
		consultaTaxisAeropuertoStep.confirmarConsulta();
	}

	@Then("^Hace validacion de consulta exitosa!$")
	public void hace_validacion_de_consulta_exitosa() throws Throwable {
		consultaTaxisAeropuertoStep.validacionConsultExitosa();
	}

}
