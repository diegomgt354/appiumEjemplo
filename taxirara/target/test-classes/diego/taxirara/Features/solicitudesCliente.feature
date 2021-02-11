@solicitudes
Feature: solicitudes en el aplicativo taxi
  quiero poder solictar acciones en el aplicativo taxiRara

  @solicitudViajeCliente
  Scenario Outline: solicitud de viaje cliente
  	Given Ingresar al aplicativo
    When Ir a tipo cliente
    And seleccionar ya tengo cuenta
    And Ingresar datos "<correo>" y "<password>" en login
    Then Ingresar
    And GPS en "<activaGPS>"
    And seleccionar ubicacion de "<recogida>"
    And seleccionar destino en "<destino>" 
   	And solicitar viaje
   	And buscar conductor 
   
    
  Examples:
  	| 			correo 			|  	password   	|	activaGPS	|  					recogida   							|		destino			|
  	| clienteprimero@gmail.com  |    1234567    |		SI		| Las Magnolias, Pueblo Nuevo 13851, Peru Pueblo Nuevo	|	La Libertad 500 143	|
  	
 #En esta seccion se tiene que tener un Conductor conectado para poder aceptar la solicitud del cliente
  @iniciarViajeCliente
  Scenario Outline: solicitud de viaje iniciado cliente
  	Given Ingresar al aplicativo
    When Ir a tipo cliente
    And seleccionar ya tengo cuenta
    And Ingresar datos "<correo>" y "<password>" en login
    Then Ingresar
    And GPS en "<activaGPS>"
    And seleccionar ubicacion de "<recogida>"
    And seleccionar destino en "<destino>" 
   	And solicitar viaje
   	And buscar conductor 
   	And Esperar "5" segundos
    
  Examples:
  	| 			correo 			|  	password   	|	activaGPS	|  					recogida   							|		destino			|
  	| clienteprimero@gmail.com  |    1234567    |		SI		| Las Magnolias, Pueblo Nuevo 13851, Peru Pueblo Nuevo	|	La Libertad 500 143	|
  	
  	