package Booking.Steps;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import net.thucydides.core.annotations.Step;

public class BotonesPaginas {

	private WebDriver driver;
	private Questions questions;

	@FindBy(how = How.XPATH, using = "//button[@class = 'btn btn-primary']")
	private WebElement btnEnviar;

	@FindBy(how = How.XPATH, using = "//li[@id = 'item-7']")
	private WebElement btnDowload;
	
	@FindBy(how = How.ID, using = "item-3")
	private WebElement btnTable;

	public BotonesPaginas(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.questions = new Questions(driver);

	}

	@Step
	public void btnEnviar() {
		btnEnviar.click();
	}

	@Step
	public void scrollBajarDos() {

		WebElement enviar = driver.findElement(By.cssSelector("#submit"));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView();", enviar);

	}

	@Step
	public void scrollBajarSumit() {

		Actions scrolldown = new Actions(driver);
		List<WebElement> li = driver.findElements(By.xpath("//li"));
		scrolldown.moveToElement(li.get(8)).build().perform();

	}

	@Step
	public void CargarArchivo() {

		File file = new File("C:\\Users\\Jhonatan\\Documents\\imagen.png");
		String path = file.getAbsolutePath();
		driver.findElement(By.id("uploadFile")).sendKeys(path);
		questions.tiempoSegundos(1);
		System.out.println(file);

	}

	@Step
	public void scrollBtnUpdate() {

		Actions scrolldown = new Actions(driver);
		List<WebElement> article = driver.findElements(By.xpath("//li"));
		scrolldown.moveToElement(article.get(8)).build().perform();

	}

	@Step
	public void btnDowload() {
		questions.tiempoSegundos(1);
		btnDowload.click();
	}
	
	@Step
	public void btnTable() {
		btnTable.click();
	}

	@Step
	public void buscarName(String bucarNameP ) {
		WebElement buscar = driver.findElement(By.xpath("//div[contains(text(), "+bucarNameP+")]/../div[7]/div/span[@class = 'mr-2'][1]"));
		System.out.println(buscar);
		buscar.click();
	}
}
