package metodos;

import static org.junit.Assert.assertEquals;
import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.Drivers;

public class Metodos extends Drivers {
 
	/**
	 * Clicar em um elemento passando o By
	 * 
	 * @param elemento
	 */
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	/**
	 * Escrever em um elemento
	 * 
	 * @param elemento
	 * @param texto
	 */
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	/**
	 * Informar a url que deseja validar
	 * 
	 * @param urlEsperada
	 */
	public void validarUrl(String urlEsperada) {
		assertEquals(urlEsperada, driver.getCurrentUrl());
	}

	/**
	 * Informar o texto esperado para ser validado com o texto capturado
	 * 
	 * @param elemento
	 * @param textoEsperado
	 */
	public void validarTexto(By elemento, String textoEsperado) {
		assertEquals(textoEsperado, driver.findElement(elemento).getText());
	}

	/**
	 * informar o elemento que será aguardado até segundos, dado que exceda o tempo,
	 * irá ocorrer time out.
	 * 
	 * @param elemento
	 */
	public void aguardarElemento(By elemento) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(elemento));
	}

	public void tirarPrint(String nomePastaDoTeste, String nomeDoTeste) {

		File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(scrfile, new File("./evidencias/" + nomePastaDoTeste + "/" + nomeDoTeste + ".png"));
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void trocarDeAba() {

		String abaPrincipal = driver.getWindowHandle();
		Set<String> todasAbas = driver.getWindowHandles();

		for (String ultimaAbaAberta : todasAbas) {

			if (!ultimaAbaAberta.equals(abaPrincipal)) {

				driver.switchTo().window(ultimaAbaAberta);

			}
		}

	}

	public void validarAlert(String textoEsperado) {
		pausa(5000);
		Alert alert = driver.switchTo().alert();
		assertEquals(alert.getText(), textoEsperado);
	}

	public void scrooll(String pixels) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroollBy(0," + pixels + ")");
	}

	public void zoom(String zoom) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom'" + zoom + "%'");
	}

	public void moverEClicar(By elemento) {

		WebElement el = driver.findElement(elemento);
		Actions actions = new Actions(driver);
		actions.moveToElement(el).click().perform();
	}

	public void duploClique(By elemento) {

		WebElement el = driver.findElement(elemento);
		Actions actions = new Actions(driver);
		actions.doubleClick(el).perform();

	}

	public void mouseOver(By elemento) {

		WebElement el = driver.findElement(elemento);
		Actions actions = new Actions(driver);
		actions.moveToElement(el).perform();
	}

	public void tab() {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB).perform();
	}

	public void enter() {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
	}

	public void enter(By elemento) {
		driver.findElement(elemento).sendKeys(Keys.ENTER);
	}

	public void limparCampo(By elemento) {
		driver.findElement(elemento).clear();
	}

	public void digitarPausadamente(By elemento, String texto) {
		for (char c : texto.toCharArray()) {
			driver.findElement(elemento).sendKeys(String.valueOf(c));
			pausa(1000);
		}
	}

	public void clicaESegura(By elemento) {
		WebElement el = driver.findElement(elemento);
		Actions actions = new Actions(driver);
		actions.clickAndHold(el).perform();
	}

	public void submite(By elemento) {
		driver.findElement(elemento).submit();
	}

	public void validarTitle(String titleEsperado) {
		assertEquals(titleEsperado, driver.getTitle());
	}

	public void voltaPagina() {
		driver.navigate().back();
	}

	public void avancarPagina() {
		driver.navigate().forward();
	}

	public void atualizarPagina() {
		driver.navigate().refresh();
	}

	public void uploadDeArquivo(By elemento, String path) {
		driver.findElement(elemento).sendKeys(path);
	}

	public void fecharPopUp(By elemento) {
		int contador = 3;
		WebElement element = driver.findElement(elemento);
		do {
			clicar(elemento);
			contador--;
		} while (element.isDisplayed() && contador > 0);

	}

	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void verificaTextoPresente() {

	}

	public void verificaCheckBoxSelecionado() {

	}

	public void validarLivroDeOfertas(List<String[]> ofertasEsperadas) {
	
		//Pegar todas as linhas da tabela
		List<WebElement> linhas = driver.findElements(By.xpath("//*[@id='order-book']//tbody//tr"));
		
		//Percorrer todas as linhas da tabela
		for(int i = 0; i < linhas.size();i++) {
			
			WebElement linha = linhas.get(i);
			
			//Para cada linha, capturar as coludar <td>
			List<WebElement> colunas = linha.findElements(By.tagName(""));
			
		}
		
		
	}
	
}
