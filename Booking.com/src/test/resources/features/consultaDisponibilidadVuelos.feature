#Escenario 2
Feature: Booking.com 
  Como usuario deseo realizar consulta de disponibilidad de vuelos
 
	Scenario: Ingresar al home de Booking.com y realizar consulta de disponibilidad de vuelos
   
    Given El usuario ingresa a la pagina de Booking.com
    When Hace click en el modulo de "Vuelos"
    And Ingresa "MDE" en el campo destino de vuelo
    And Selecciona boton "buscar"
    Then Hace validacion de consulta exitosa