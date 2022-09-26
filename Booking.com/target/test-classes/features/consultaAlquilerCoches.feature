#Escenario 3
Feature: Booking.com 
  Como usuario deseo realizar consulta de disponibilidad de alquiler de coches
 
	Scenario: Ingresar al home de Booking.com y realizar consulta disponibilidad de alquiler de coches
   
    Given El usuario ingresa a Booking.com
    When Abre el modulo de "Alojamiento"
    And Ingresa "Aeropuerto de Bogotá, Colombia" en el punto de encuentro
    And realiza click en boton "buscar"
    Then Realiza validacion de consulta exitosa de disponibilidad de alquiler de autos