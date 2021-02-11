package diego.taxirara.Utilitarios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Screamshop {
	public void takeScreenShotTest(String ruta, AndroidDriver<AndroidElement> driver, String imageName) {
		String rutaimagen = ConfigProp.getRutaRaiz() + ruta; 
		File directory = new File(rutaimagen);
		System.out.println("directoryImagen: " + directory);
		try {
			if (directory.isDirectory()) {
				System.out.println("La ruta si existe en imagen");
				Thread.sleep(1000);
				File imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);// Toma la captura de imagen
				FileUtils.copyFile(imagen, new File(directory.getAbsolutePath() + "\\" + imageName + ".png"));
			} else {
				System.out.println("La ruta no existe imagen");
				throw new IOException("ERROR : La ruta especificada no es un directorio!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
