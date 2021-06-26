package Booking.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Booking.Steps.BotonesPaginas;
import net.thucydides.core.annotations.Step;

public class WebTablePagina {
	
	private WebDriver driver;
	private BotonesPaginas botonesPaginas = new BotonesPaginas(driver);
	
	public WebTablePagina(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.botonesPaginas = new BotonesPaginas(driver);
		
	}
	
	@Step
	public void webTableM() {
		botonesPaginas.scrollBajarSumit();
		botonesPaginas.btnTable();
	}
	
	@Step
	public void buscarName(String bucarNameP) {
		botonesPaginas.buscarName(bucarNameP);
	}
	

}
