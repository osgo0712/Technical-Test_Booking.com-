package PageObject;

import static org.junit.Assert.fail;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl ("https://www.booking.com/index.es.html?label=gen173nr-1BCAEoggI46AdIM1gEaDKIAQGYAQq4ARfIAQzYAQHoAQGIAgGoAgO4Aue_sJkGwAIB0gIkOTRiOWQ2Y2ItYzZhOS00MDlmLWJkNzEtZWI5NzY4YmNmZGEy2AIF4AIB&sid=fac378166e1d9c5db6463d84db97e8e8&keep_landing=1&sb_price_type=total&")

public class consultaTaxisAeropuertoPageObject extends PageObject{
	
	String puntoPartida, puntoDestino;
	
	static By btnModuloTaxisAeropuerto = generalElements.btnModuloTaxisAeropuerto.getValor_campo();
	static By inputLugarRecogidaTxi = generalElements.inputLugarRecogidaTxi.getValor_campo();
	static By inputIndicaDestino = generalElements.inputIndicaDestino.getValor_campo();
	static By btnConfirmarConsultaTaxis = generalElements.btnConfirmarConsultaTaxis.getValor_campo();
	static By opcRecogida = generalElements.opcRecogida.getValor_campo();
	static By opcIndicaDestino = generalElements.opcIndicaDestino.getValor_campo();
	static By validacionConsultaTaxis = generalElements.validacionConsultaTaxis.getValor_campo();

	
	@WhenPageOpens
	public void maximiseScreen() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		getDriver().manage().window().maximize();
		Thread.sleep(1000);
	}

	public void seleccionModulo() {

		try {
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(getDriver(),200);
			wait.until(ExpectedConditions.visibilityOfElementLocated(btnModuloTaxisAeropuerto));
			find(btnModuloTaxisAeropuerto).isVisible();
			Thread.sleep(1000);
			find(btnModuloTaxisAeropuerto).click();

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[Booking.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}

	}
	
	public void ingresoUbicaciones() {

		try {
			//OBJETO LOADPROPERTY
			Properties loadProperty = new Properties();	
			loadProperty.load(new FileReader("./params.properties"));
			
			
			WebDriverWait wait = new WebDriverWait(getDriver(),200);
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(inputLugarRecogidaTxi));
			find(inputLugarRecogidaTxi).isVisible();
			Thread.sleep(1000);
			puntoPartida = loadProperty.getProperty("puntoPartida");
			puntoDestino = loadProperty.getProperty("puntoDestino");
			Thread.sleep(1000);
			find(inputLugarRecogidaTxi).sendKeys(puntoPartida);
			Thread.sleep(1000);
			find(opcRecogida).click();
			Thread.sleep(1000);
			find(inputIndicaDestino).sendKeys(puntoDestino);
			Thread.sleep(1000);
			find(opcIndicaDestino).click();

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[Booking.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}

	}
	
	public void confirmarConsulta() {

		try {
			
			//OBJETO LOADPROPERTY
			Properties loadProperty = new Properties();	
			loadProperty.load(new FileReader("./params.properties"));
			
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(getDriver(),200);
			wait.until(ExpectedConditions.visibilityOfElementLocated(btnConfirmarConsultaTaxis));
			Thread.sleep(1000);
			find(btnConfirmarConsultaTaxis).click();
			Thread.sleep(5000);

			

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[Booking.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}

	}
	
	public void validacionConsultExitosa() {

		try {

			//OBJETO LOADPROPERTY
			Properties loadProperty = new Properties();	
			loadProperty.load(new FileReader("./params.properties"));
			WebDriverWait wait = new WebDriverWait(getDriver(),200);

			//WAIT
			wait.until(ExpectedConditions.visibilityOfElementLocated(validacionConsultaTaxis));
			Thread.sleep(2000);
			find(validacionConsultaTaxis).isVisible();
			System.out.println("***************************************************************************************");
			System.out.println("[Booking.com] - CASO DE PRUEBA EXITOSO");
			System.out.println("***************************************************************************************");

			Thread.sleep(3000);

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[Booking.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}
}
