package Booking.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Booking.Steps.BotonesPaginas;
import Booking.Steps.Questions;
import net.serenitybdd.screenplay.Question;

public class UploadPage {

	private WebDriver driver;
	private Questions questions = new Questions(driver);
	private BotonesPaginas botonesPaginas = BotonesPaginas(driver);

	public UploadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}


		
		
		
		
	}
}
