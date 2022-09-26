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

public class consultaDisponibilidadVuelosPageObject extends PageObject{
	
	//VARIABLES GLOBALES
	String Mde;

	static By btnModuloVuelos = generalElements.btnModuloVuelos.getValor_campo();
	static By inputDestinoVuelo1 = generalElements.inputDestinoVuelo1.getValor_campo();
	static By inputDestinoVuelo2 = generalElements.inputDestinoVuelo2.getValor_campo();
	static By opcCiudadDestino = generalElements.opcCiudadDestino.getValor_campo();
	static By btnConsultar = generalElements.btnConsultar.getValor_campo();
	static By validacionConsultaVuelos = generalElements.validacionConsultaVuelos.getValor_campo();
	
	
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
			wait.until(ExpectedConditions.visibilityOfElementLocated(btnModuloVuelos));
			find(btnModuloVuelos).isVisible();
			Thread.sleep(1000);
			find(btnModuloVuelos).click();

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[Booking.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}

	}
	
	public void ingresoDestinoVuelos() {

		try {

			//OBJETO LOADPROPERTY
			Properties loadProperty = new Properties();	
			loadProperty.load(new FileReader("./params.properties"));
			WebDriverWait wait = new WebDriverWait(getDriver(),200);

			//WAIT
			wait.until(ExpectedConditions.visibilityOfElementLocated(inputDestinoVuelo1));
			Thread.sleep(2000);
			find(inputDestinoVuelo1).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(inputDestinoVuelo2));
			find(inputDestinoVuelo2).clear();
			Thread.sleep(1000);
			Mde = loadProperty.getProperty("Mde");
			Thread.sleep(1000);
			find(inputDestinoVuelo2).sendKeys(Mde);
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(opcCiudadDestino));
			find(opcCiudadDestino).click();

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
			wait.until(ExpectedConditions.visibilityOfElementLocated(btnConsultar));
			Thread.sleep(1000);
			find(btnConsultar).click();
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
			wait.until(ExpectedConditions.visibilityOfElementLocated(validacionConsultaVuelos));
			Thread.sleep(2000);
			find(validacionConsultaVuelos).isVisible();
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
