package Booking.Definitions;

import org.openqa.selenium.WebDriver;

import Booking.Paginas.CargarArchivoPagina;
import Booking.Paginas.EnviarCorreoPagina;
import Booking.Paginas.TextBoxPage;
import Booking.Paginas.WebTablePagina;
import Booking.Steps.BotonesPaginas;
import Booking.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private TextBoxPage textBoxPage = new TextBoxPage(driver);

	
	
	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

	@And("^escribir nombre(.*)$")
	public void diligenciarCampos(String userNameP) {
		this.textBoxPage = new TextBoxPage(driver);
		this.textBoxPage.diligenciarCorreoM(userNameP);
		

	}

	
	}
	
	