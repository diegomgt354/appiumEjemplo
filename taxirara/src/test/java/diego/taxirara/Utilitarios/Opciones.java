package diego.taxirara.Utilitarios;

import org.openqa.selenium.support.ui.ExpectedConditions;
import io.appium.java_client.android.AndroidElement;


public class Opciones extends base {
	
	public void clickXpath(String xpath) {
		AndroidElement element = driver.findElementByXPath(xpath);
		waitVisibleAndClickable(element);
		element.click();
	}
	
	public void clickId(String id) {
		AndroidElement element = driver.findElementById(id);
		waitVisibleAndClickable(element);
		element.click();
	}

	public void IdSendKeys(String id, String texto) {
		AndroidElement element = driver.findElementById(id);
		waitVisible(element);
		element.sendKeys(texto);
	}
	
	public void XpathSendKeys(String xpath, String texto) {
		AndroidElement element = driver.findElementByXPath(xpath);
		waitVisible(element);
		element.sendKeys(texto);
	}
	
	public void Xpath_Click_Clean_SendKeys(String xpath, String texto) {
		AndroidElement element = driver.findElementByXPath(xpath);
		waitVisibleAndClickable(element);
		element.click();
		element.clear();
		element.sendKeys(texto);
	}
	
	public void Id_Click_Clean_SendKeys(String id, String texto) {
		AndroidElement element = driver.findElementById(id);
		waitVisibleAndClickable(element);
		element.click();
		element.clear();
		element.sendKeys(texto);
	}

	public void waitVisible(AndroidElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitVisibleAndClickable(AndroidElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitVisibleId(String id) {
		AndroidElement element = driver.findElementById(id);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public String getTextXpath(String xpath){
		AndroidElement element = driver.findElementByXPath(xpath);
		waitVisible(element);
		System.out.println(element.getText());
		return element.getText();
	}
	
	public void getTextId(String id){
		AndroidElement element = driver.findElementById(id);
		waitVisible(element);
		System.out.println(element.getText());
	}
}
