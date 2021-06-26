package Booking.Steps;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ibm.icu.text.SimpleDateFormat;

import net.thucydides.core.annotations.Step;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

public class Questions {

	private WebDriver driver;

	public Questions(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@Step
	public void tituloAssert(WebDriver driver) {

		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, "Booking.com");
	}

	@Step
	public void screenShot(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String filename = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File dest = new File("C:\\Users\\jmedina\\Documents\\Captura" + filename + ".png");
		try {
			FileUtils.copyFile(scr, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@Step
	public void textoAssert(WebDriver driver) {

		Assert.assertEquals("Introduce tu contraseña", "Introduce tu contraseña");
	}

	@Step
	public void textoCrearCuentaAssert(WebDriver driver) {

		Assert.assertEquals("Crea una contraseña", "Crea una contraseña");
	}

	@Step
	public void tiempoSegundos(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Step
	public void assertDatos(String nombreP) {
		String output = driver.findElement(By.id("name")).getText();
		String output1 = driver.findElement(By.id("email")).getText();
		System.out.println(output);
		assertEquals("Name:" +nombreP , output);
		assertEquals("Email:" +nombreP , output1);

	}

}