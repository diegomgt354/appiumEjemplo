package diego.taxirara.View;

import java.net.MalformedURLException;

import diego.taxirara.Utilitarios.ConfigProp;
import diego.taxirara.Utilitarios.Constants;
import diego.taxirara.Utilitarios.Opciones;
import diego.taxirara.Utilitarios.Screamshop;
import diego.taxirara.Utilitarios.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Inicio extends base{
	
	static Screamshop screamshop;
	static Opciones opc;
	
	public Inicio() {
		screamshop= new Screamshop();
		opc = new Opciones();
	}

	//sem 13 bd
	//sem 14 plan de pruebas
	//sem 15 todo
		
	
	public void correrAPK() throws MalformedURLException{
		AndroidDriver<AndroidElement> levante = Capabilities();
	}
	
	public void opcSoyCliente(){
		screamshop.takeScreenShotTest(ConfigProp.getRutaImgClienteLogin(), driver, "SOY CLIENTE");
		opc.clickXpath(Constants.BTN_SOYCLIENTE);
	}
	
	public void opcSoyConductor(){
		screamshop.takeScreenShotTest(ConfigProp.getRutaImgClienteLogin(), driver, "SOY CONDUCTOR");
		opc.clickXpath(Constants.BTN_SOYCONDUCTOR);
	}

	public void opcTengoCuenta(){
		screamshop.takeScreenShotTest(ConfigProp.getRutaImgClienteLogin(), driver, "YA TENGO CUENTA");
		opc.clickXpath(Constants.BTN_YATENGOCUENTA);
	}
	
	public void opcRegistrar(){
		screamshop.takeScreenShotTest(ConfigProp.getRutaImgDriverRegistro(), driver, "REGISTRO");
		opc.clickXpath(Constants.BTN_REGISTRO);
	}
	
	public void RegistroCliente(String name,String correo, String password){
		opc.IdSendKeys(Constants.TXT_REG_CLIENTE_NOMBRE,name);
		opc.IdSendKeys(Constants.TXT_REG_CLIENTE_EMAIL,correo);
		opc.IdSendKeys(Constants.TXT_REG_CLIENTE_PASSWORD,password);
		screamshop.takeScreenShotTest(ConfigProp.getRutaImgClienteRegistro(), driver, "LLENADO DE DATOS");
	}
	
	public void RegistroConductor(String name,String correo, String marca, String placa, String password){
		opc.IdSendKeys(Constants.TXT_REG_CONDUCTOR_NOMBRE,name);
		opc.IdSendKeys(Constants.TXT_REG_CONDUCTOR_EMAIL,correo);
		opc.IdSendKeys(Constants.TXT_REG_CONDUCTOR_MARCA,marca);
		opc.IdSendKeys(Constants.TXT_REG_CONDUCTOR_PLACA,placa);
		opc.IdSendKeys(Constants.TXT_REG_CONDUCTOR_PASSWORD,password);
		screamshop.takeScreenShotTest(ConfigProp.getRutaImgDriverRegistro(), driver, "LLENADO DE DATOS");
	}
	
	public void btnRegistrar(){
		opc.clickXpath(Constants.BTN_REGISTRAR);
		screamshop.takeScreenShotTest(ConfigProp.getRutaImgClienteRegistro(), driver, "CARGA");
	}
	
	public void loginLlenado(String correo, String password){
		opc.IdSendKeys(Constants.TXT_EMAIL, correo);
		opc.IdSendKeys(Constants.TXT_PASSWORD, password);
		screamshop.takeScreenShotTest(ConfigProp.getRutaImgClienteLogin(), driver, "LLENADO DE DATOS");
	}
	
	public void btnIngresar(){
		opc.clickXpath(Constants.BTN_INGRESAR);
		screamshop.takeScreenShotTest(ConfigProp.getRutaImgClienteLogin(), driver, "CARGA");
	}
	
	public void OpcionAtras(){
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
	public void OpcionSalir(){
		opc.clickXpath(Constants.TOOLBAR_OPCIONES);
		opc.clickXpath(Constants.OPC_SALIR);
		screamshop.takeScreenShotTest(ConfigProp.getRutaImgClienteLogin(), driver, "SALIDA");
	}
	
	public void OpcionActualizar(){
		opc.clickXpath(Constants.TOOLBAR_OPCIONES);
		opc.clickXpath(Constants.OPC_EDITAR);
		screamshop.takeScreenShotTest(ConfigProp.getRutaImgClienteLogin(), driver, "ACTUALIZAR");
	}
	
	public void OpcionHistorial(){
		opc.clickXpath(Constants.TOOLBAR_OPCIONES);
		opc.clickXpath(Constants.OPC_HISTORIAL);
		screamshop.takeScreenShotTest(ConfigProp.getRutaImgClienteLogin(), driver, "HISTORIAL");
	}
	//public void validarPantalla_inicial(){
	//	Assert.assertEquals(opc.getTextXpath(Constants.MSN_INICIO), "Rapido y Seguro");
	//}
	
	public void conectarConductor(){
		opc.clickId(Constants.BTN_CONECTAR);
		screamshop.takeScreenShotTest(ConfigProp.getRutaImgDriverLogin(), driver, "CONECTAR CONDUCTOR");
	}
	
	public void btnOpcionRegistro(){
		screamshop.takeScreenShotTest(ConfigProp.getRutaImgClienteRegistro(), driver, "REGISTRO");
		opc.clickXpath(Constants.BTN_REGISTRO);
	}
	
	// SI - NO
	public void opcionGPS(String access){
		opc.waitVisibleId(Constants.BTN_ALLOW);
		screamshop.takeScreenShotTest(ConfigProp.getRutaImgClienteLogin(), driver, "INGRESO");
		if (access=="SI") {
			opc.clickId(Constants.BTN_ALLOW);
			System.out.println(access);
		}else{
			opc.clickId(Constants.BTN_DENY);
			opc.clickXpath("//android.widget.Button[@text='OK']");
			opc.clickId(Constants.BTN_ALLOW);
			System.out.println(access+", pero es necesario para que el aplicativo funcione, asi que SI.");
		}
	}
	
	public void lupaLugarRecogida() throws InterruptedException{
		Thread.sleep(3000);
		opc.clickXpath(Constants.LUPA_RECOGIDA);//lupa Lugar de recogida
		Thread.sleep(4000);
		opc.clickXpath(Constants.LIMPIAR_LUPA_RECOGIDA);//X - limpiar
	}
	
	public void lupaLugarDestino() throws InterruptedException{
		Thread.sleep(3000);
		opc.clickXpath(Constants.LUPA_DESTINO);//lupa Destino
		Thread.sleep(4000);
		opc.clickXpath(Constants.LIMPIAR_LUPA_DESTINO);//X - limpiar
	}
	
	public void ingresarDireccionBuscador(String direccion) throws InterruptedException{
		opc.Xpath_Click_Clean_SendKeys(Constants.TXT_DIRECCION, direccion);
		Thread.sleep(4000);
		opc.clickXpath(Constants.PRIMERA_OPC_TXT_DIRECCION);//la primera opcion
	}
	
	public void btnSolicitarViaje() throws InterruptedException{
		opc.clickId(Constants.BTN_SOLICITAR_VIAJE);
		Thread.sleep(3000);
		opc.getTextId("com.idat.mototaxi:id/textViewOrigin");//origen
		opc.getTextId("com.idat.mototaxi:id/textViewDestination");//destino
		opc.getTextId("com.idat.mototaxi:id/textViewTime");//tiempo y distancia
		opc.getTextId("com.idat.mototaxi:id/textViewPrice");//precio
	}
	
	public void btnBuscarConductor() throws InterruptedException{
		opc.clickId(Constants.BTN_BUSCAR_CONDUCTOR);
		opc.getTextId(Constants.TXT_ESTADO_BUSQUEDA);
		Thread.sleep(1000);
		opc.getTextId(Constants.TXT_ESTADO_BUSQUEDA);
	}	
	
	public void actualizarCliente(String name){
		opc.Id_Click_Clean_SendKeys(Constants.TXT_EDITAR_CLIENTE, name);
		driver.hideKeyboard();
		opc.clickId(Constants.BTN_ACTUALIZAR_PERFIL);
	}
}
