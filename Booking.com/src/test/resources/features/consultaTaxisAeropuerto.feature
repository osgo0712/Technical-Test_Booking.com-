#Escenario 5
Feature: Booking.com 
  Como usuario deseo realizar consulta de disponibilidad de taxis al aeropuerto
 
	Scenario: Ingresar al home de Booking.com y realizar consulta de disponibilidad de taxis al aeropuerto
   
    Given El usuario ingresa al home de la pagina de Booking.com!
    When Hace click en el modulo de "Taxis Aeropuerto"!
    And Ingresa "Centro comercial andino" en el campo "lugar de recogida"! y "Aeropuerto internacional el dorado" en el campo "Indica destino"!
    And Selecciona boton "buscar"!
    Then Hace validacion de consulta exitosa!