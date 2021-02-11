package diego.taxirara.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/diego/taxirara/Features",//ubicacion de archivos features
		glue={"diego/taxirara/Steps"},//ubicacion de archivos steps
		format={"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},//NOS GENERAN DIFERENTES TIPOS DE REPORTES
		monochrome=true,//mostrar la consola en un formato de lectura adecuado
		//tags={"@Ingresos","@IngresoconelusuarioCliente"},
		//tags={"@Ingresos","@IngresoconelusuarioConductor"},
		//tags={"@Registros","@RegistroenelusuarioCliente"},
		//tags={"@Registros","@RegistroenelusuarioConductor"},
		//tags={"@solicitudes","@solicitudViajeCliente"},
		//tags={"@solicitudes","@iniciarViajeCliente"},
		//tags={"@Salidas","@SalidaconelusuarioCliente"},
		//tags={"@Salidas","@SalidaconelusuarioConductor"},
		tags={"@Actualizar","@ActualizaconelusuarioCliente"},
		strict=true,//Verificará si algún paso no está definido en el archivo de definición de pasos
		dryRun=false//para verificar el mapeo adecuado entre el archivo de características y el archivo de definición de pasos
		)
public class TestRunner {

}
