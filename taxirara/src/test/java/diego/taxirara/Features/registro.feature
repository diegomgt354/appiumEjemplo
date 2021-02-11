@Registros
Feature: Registro en el aplicativo taxi
  quiero poder registrarme en el aplicativo taxiRara

  @RegistroenelusuarioCliente
  Scenario Outline: Registro de cliente
  	Given Ingresar al aplicativo
    When Ir a tipo cliente
    And seleccionar registrarme ahora
    And Ingresar datos cliente "<nombre>" "<correo>" y "<password>" en login
    Then registrar
    And GPS en "<activaGPS>"
    
  Examples:
  	|		nombre		| 			correo 			|	password	|	activaGPS	|
  	|	diego gutierrez	| 	diegoidat2@gmail.com  	|	1234567		|		NO		|
  	

  @RegistroenelusuarioConductor
  Scenario Outline: Registro de conductor
  	Given Ingresar al aplicativo
    When Ir a tipo conductor
    And seleccionar registrarme ahora
    And Ingresar datos "<nombre>" "<correo>" "<marca>" "<placa>" y "<password>" en login
    Then registrar
    And Conectar conductor
    And GPS en "<activaGPS>"
    
  Examples:
  	|		nombre		| 		correo 			|  		marca		|	placa	|	password	|	activaGPS	|
  	|	diego gutierrez	| diegodri2@gmail.com  	|    motitoXD		|	abc-123	|	1234567		|		SI		|