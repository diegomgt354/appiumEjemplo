@Actualizar
Feature: Ingreso al aplicativo taxi
  quiero poder ingresar al aplicativo taxiRara

  @ActualizaconelusuarioCliente
  Scenario Outline: Ingreso de cliente
  	Given Ingresar al aplicativo
    When Ir a tipo cliente
    And seleccionar ya tengo cuenta
    And Ingresar datos "<correo>" y "<password>" en login
    Then Ingresar
    And GPS en "<activaGPS>"
    And ir a opcion Actualizar
    And actualizar datos cliente "<nombre>"
    And Atras

  Examples:
  	| 			correo 			|  	password   	|	activaGPS	|	nombre	|
  	| clienteprimero@gmail.com  |    1234567    |		NO		|  diego546	|
  	

  @ActualizaconelusuarioConductor
  Scenario Outline: Ingreso de cliente
  	Given Ingresar al aplicativo
    When Ir a tipo conductor
    And seleccionar ya tengo cuenta
    And Ingresar datos "<correo>" y "<password>" en login
    Then Ingresar
    And Conectar conductor
    And GPS en "<activaGPS>"
    And ir a opcion Actualizar
    And actualizar datos conductor
    And Atras
    
  Examples:
  	| 		correo 			|  	password   	|	activaGPS	|
  	| 	omarcito@gmail.com  |    1234567    |		SI		|