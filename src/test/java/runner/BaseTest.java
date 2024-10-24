package runner;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;

public class BaseTest extends Drivers {

	public static void iniciarTeste() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/index.php");
	}

	public static void finalizarTeste() {
		driver.quit();

	}
	
}
