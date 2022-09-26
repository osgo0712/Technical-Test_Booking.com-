#Escenario 1
Feature: Booking.com 
  Como usuario deseo realizar consulta de alojamientos para la ciudad de medellin
 
	Scenario: Ingresar al home de Booking.com y realizar consulta de alojamientos para la ciudad de medellin
   
    Given El usuario abre la pagina de Booking.com
    When Ingresa al modulo de "Alojamiento"
    And Ingresa "medellin" en el campo de ciudad 
    And Realiza seleccion de "fecha inicio" y "fecha fin"
    And Hace click en boton "buscar"
    Then Realiza validacion de consulta exitosa