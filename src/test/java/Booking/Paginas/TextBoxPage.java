package Booking.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import net.thucydides.core.annotations.Step;

public class TextBoxPage {

private WebDriver driver;

@FindBy(how = How.ID, using = "userName")
private WebElement inputUserName;
	
public TextBoxPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
	
	@Step
   
public void diligenciarCorreoM(String userNameP){
	inputUserName.sendKeys("userNameP");
		
		
		
		
	}	
	
}
		
		
	


