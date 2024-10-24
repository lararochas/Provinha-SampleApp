package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import drivers.Drivers;
import elementos.Elementos;
import metodos.Metodos;

public class DadosOpcaoPrecoPage extends Drivers {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	public void selecionarPreco() {
		WebElement labelUltimate = driver.findElement(By.xpath("//input[@id='selectultimate']/parent::label"));
		labelUltimate.click();
		
	}

	public void clicarEmNext() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement nextButton = driver.findElement(By.id("nextsendquote"));
		js.executeScript("arguments[0].click();", nextButton);
	}
}
