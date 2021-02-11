package diego.taxirara.Utilitarios;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	
	protected static AndroidDriver<AndroidElement> driver;
	static WebDriverWait wait;
	//static Screamshop screamshop;
	//static Opciones opc;
	
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		
		File file = new File("archivos");
		File ubication = new File(file, "app-release-v11.apk");
		//screamshop = new Screamshop();
		DesiredCapabilities capa = new DesiredCapabilities();
		capa.setCapability(MobileCapabilityType.DEVICE_NAME, "emuladordiego1");
		capa.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");// nuevo paso de appium XD
		capa.setCapability(MobileCapabilityType.APP, ubication.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capa);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);
		//opc = new Opciones();	
		return driver;
	}
}
