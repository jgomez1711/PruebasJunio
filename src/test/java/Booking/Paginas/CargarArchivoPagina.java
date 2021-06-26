package Booking.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Booking.Steps.BotonesPaginas;
import net.thucydides.core.annotations.Step;

public class CargarArchivoPagina {
	
	private WebDriver driver;
	private BotonesPaginas botonesPaginas = new BotonesPaginas(driver);
	
	public CargarArchivoPagina(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.botonesPaginas = new BotonesPaginas(driver);
	}
	
	@Step
	public void llegarUpload() {
		botonesPaginas.scrollBajarSumit();
		botonesPaginas.btnDowload();
		botonesPaginas.CargarArchivo();
	}

}
