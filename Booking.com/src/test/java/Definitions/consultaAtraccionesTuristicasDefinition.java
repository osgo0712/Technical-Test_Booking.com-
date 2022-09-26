package Definitions;

import Steps.consultaAtraccionesTuristicasStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class consultaAtraccionesTuristicasDefinition {
	
	@Steps
	consultaAtraccionesTuristicasStep consultaAtraccionesTuristicasStep;
	
	@Given("^¡El usuario ingresa a la pagina de Booking\\.com!$")
	public void el_usuario_ingresa_a_la_pagina_de_Booking_com() throws Throwable {
		consultaAtraccionesTuristicasStep.open();
	}


	@When("^¡Hace click en el modulo de \"([^\"]*)\"!$")
	public void hace_click_en_el_modulo_de(String arg1) throws Throwable {
		consultaAtraccionesTuristicasStep.seleccionModulo();
	}

	@When("^¡Ingresa \"([^\"]*)\" en el campo \"([^\"]*)\"!$")
	public void ingresa_en_el_campo(String arg1, String arg2) throws Throwable {
		consultaAtraccionesTuristicasStep.ingresoSitioTuristico();
	}

	@When("^¡Ingresa rango de fechas de (\\d+) dias!$")
	public void ingresa_rango_de_fechas_de_dias(int arg1) throws Throwable {
	    consultaAtraccionesTuristicasStep.ingresoFechas();
	}

	@When("^¡Selecciona boton \"([^\"]*)\"!$")
	public void selecciona_boton(String arg1) throws Throwable {
		consultaAtraccionesTuristicasStep.confirmarConsulta();
	}

	@Then("^¡Hace validacion de consulta exitosa!$")
	public void hace_validacion_de_consulta_exitosa() throws Throwable {
		consultaAtraccionesTuristicasStep.validacionConsultExitosa();
	}
}
