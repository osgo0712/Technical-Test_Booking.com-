#Escenario 4
Feature: Booking.com 
  Como usuario deseo realizar consulta de las atracciones turisticas para la ciudad de Bogota
 
	Scenario: Ingresar al home de Booking.com y realizar consulta de las atracciones turisticas
   
    Given ¡El usuario ingresa a la pagina de Booking.com!
    When ¡Hace click en el modulo de "Atracciones Turisticas"!
    And ¡Ingresa "Bogota" en el campo "donde vas?"!
    And ¡Ingresa rango de fechas de 3 dias!
    And ¡Selecciona boton "buscar"!
    Then ¡Hace validacion de consulta exitosa!