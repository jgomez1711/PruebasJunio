package Booking.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import net.thucydides.core.annotations.Step;

public class AmazonRegitroPagina {

	private WebDriver driver;
	//Este es el elemento que se encuentra en la pagina html
	@FindBy(how = How.ID, using = "createAccountSubmit")
	//es la variable que se va a utilizar dentro de los metodos correspondientes
	private WebElement btnCrear;
	
	@FindBy(how = How.XPATH, using ="//input[@name = 'customerName']")
	private WebElement textoNombre;
	
	
	//Esto es constructor
	public AmazonRegitroPagina(WebDriver driver) {
		//llamado a libreria de pageFactori donde vamos utilizar la sentencia de localizadores 
		PageFactory.initElements(driver, this);
	}
	//el step es para identificar los pasos que va hacer
	@Step
	//este es un metodo que vamos a utilizar en la clse definitionsStep
	public void registroAmazon() {
		btnCrear.click();
	}
	// git web
	@Step
	public void diligenciarCampo(String nombres) {
		textoNombre.sendKeys(nombres);
		System.out.println(nombres);
		System.out.println("Entro");
	}
	
}
