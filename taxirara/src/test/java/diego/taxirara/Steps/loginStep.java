package diego.taxirara.Steps;

import java.net.MalformedURLException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import diego.taxirara.View.Inicio;

public class loginStep {
	
	Inicio inicio;
	
	public loginStep() {
		super();
		inicio = new Inicio();
	}

	@Given("^Ingresar al aplicativo$")
	public void ingresar_al_aplicativo() throws MalformedURLException{
	    inicio.correrAPK();
	}
	
	@When("^Ir a tipo cliente$")
	public void ir_a_tipo_cliente(){
		inicio.opcSoyCliente();
	}
	
	@When("^Ir a tipo conductor$")
	public void ir_a_tipo_conductor(){
		inicio.opcSoyConductor();
	}
	
	@When("^seleccionar ya tengo cuenta$")
	public void seleccionar_ya_tengo_cuenta(){
	    inicio.opcTengoCuenta();
	}
	
	@When("^Ingresar datos \"([^\"]*)\" y \"([^\"]*)\" en login$")
	public void ingresar_datos_y_en_login(String correo, String password){
		inicio.loginLlenado(correo, password);
	}
	
	@Then("^Ingresar$")
	public void ingresar(){
	    inicio.btnIngresar();
	}
	
	@Then("^Salir$")
	public void Salir(){
	    inicio.OpcionSalir();
	    //inicio.validarPantalla_inicial();
	}
	
	@Then("^ir a opcion Actualizar$")
	public void ir_a_opcion_Actualizar(){
	    inicio.OpcionActualizar();
	}
	
	@Then("^actualizar datos cliente \"([^\"]*)\"$")
	public void actualizar_datos_cliente(String nombre){
	    inicio.actualizarCliente(nombre);
	}
	
	@Then("^Atras$")
	public void Atras() throws InterruptedException{
		Thread.sleep(3000);
	    inicio.OpcionAtras();
	}
	
	@Then("^Conectar conductor$")
	public void Conectar_conductor(){
	    inicio.conectarConductor();
	}
	
	@When("^GPS en \"([^\"]*)\"$")
	public void GPS_en_activo(String gps){
		inicio.opcionGPS(gps);
	}
	
	@When("^seleccionar registrarme ahora$")
	public void seleccionar_registrarme_ahora(){
	    inicio.btnOpcionRegistro();
	}

	@When("^Ingresar datos cliente \"([^\"]*)\" \"([^\"]*)\" y \"([^\"]*)\" en login$")
	public void ingresar_datos_cliente_y_en_login(String name, String correo, String password){
		inicio.RegistroCliente(name, correo, password);
	}

	@Then("^registrar$")
	public void registrar(){
	    inicio.btnRegistrar();
	}
	
	@When("^Ingresar datos \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" y \"([^\"]*)\" en login$")
	public void ingresar_datos_y_en_login(String name, String correo, String marca, String placa, String password){
	    inicio.RegistroConductor(name, correo, marca, placa, password);
	}

	@Then("^seleccionar ubicacion de \"([^\"]*)\"$")
	public void seleccionar_ubicacion_de(String recogida) throws InterruptedException{
	    inicio.lupaLugarRecogida();
	    inicio.ingresarDireccionBuscador(recogida);
	}

	@Then("^seleccionar destino en \"([^\"]*)\"$")
	public void seleccionar_destino_en(String destino) throws InterruptedException{
	    inicio.lupaLugarDestino();
	    inicio.ingresarDireccionBuscador(destino);
	}

	@Then("^solicitar viaje$")
	public void solicitar_viaje() throws InterruptedException{
	    inicio.btnSolicitarViaje();//cambio
	}

	@Then("^buscar conductor$")
	public void buscar_conductor() throws InterruptedException{
		inicio.btnBuscarConductor();
	}
	
	@Then("^Esperar \"([^\"]*)\" segundos$")
	public void esperar_segundos(String seg) throws InterruptedException{
		int segundos = Integer.parseInt(seg);
	    Thread.sleep(segundos*1000);
	}
	
}
