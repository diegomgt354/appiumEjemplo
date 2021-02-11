@Salidas
Feature: Ingreso al aplicativo taxi
  quiero poder ingresar al aplicativo taxiRara

  @SalidaconelusuarioCliente
  Scenario Outline: Ingreso de cliente
  	Given Ingresar al aplicativo
    When Ir a tipo cliente
    And seleccionar ya tengo cuenta
    And Ingresar datos "<correo>" y "<password>" en login
    Then Ingresar
    And GPS en "<activaGPS>"
    And Salir
    
  Examples:
  	| 			correo 			|  	password   	|	activaGPS	|
  	| clienteprimero@gmail.com  |    1234567    |		NO		|
  	

  @SalidaconelusuarioConductor
  Scenario Outline: Ingreso de cliente
  	Given Ingresar al aplicativo
    When Ir a tipo conductor
    And seleccionar ya tengo cuenta
    And Ingresar datos "<correo>" y "<password>" en login
    Then Ingresar
    And Conectar conductor
    And GPS en "<activaGPS>"
    And Salir
    
  Examples:
  	| 		correo 			|  	password   	|	activaGPS	|
  	| 	omarcito@gmail.com  |    1234567    |		SI		|