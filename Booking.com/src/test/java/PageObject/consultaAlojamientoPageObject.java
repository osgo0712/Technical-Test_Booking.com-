package PageObject;

import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;


@DefaultUrl ("https://www.booking.com/index.es.html?label=gen173nr-1BCAEoggI46AdIM1gEaDKIAQGYAQq4ARfIAQzYAQHoAQGIAgGoAgO4Aue_sJkGwAIB0gIkOTRiOWQ2Y2ItYzZhOS00MDlmLWJkNzEtZWI5NzY4YmNmZGEy2AIF4AIB&sid=fac378166e1d9c5db6463d84db97e8e8&keep_landing=1&sb_price_type=total&")

public class consultaAlojamientoPageObject extends PageObject{


	//VARIABLES GLOBALES
	String ciudadAlojamiento;

	//CREACION ELEMENTOS
	static By inputCiudadAlojamiento = generalElements.inputCiudadAlojamiento.getValor_campo();
	static By opcCiudadAlojamiento = generalElements.opcCiudadAlojamiento.getValor_campo();
	static By btnModuloAlojamiento = generalElements.btnModuloAlojamiento.getValor_campo();
	static By fechaInicio = generalElements.fechaInicio.getValor_campo();
	static By fechaFin = generalElements.fechaFin.getValor_campo();
	static By confirmarConsulta = generalElements.confirmarConsulta.getValor_campo();
	static By validacionConsulta = generalElements.validacionConsulta.getValor_campo();


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
			wait.until(ExpectedConditions.visibilityOfElementLocated(btnModuloAlojamiento));
			find(btnModuloAlojamiento).isVisible();

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[Booking.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}

	}

	public void ingresoCiudadAlojamiento() {

		try {

			//OBJETO LOADPROPERTY
			Properties loadProperty = new Properties();	
			loadProperty.load(new FileReader("./params.properties"));
			WebDriverWait wait = new WebDriverWait(getDriver(),200);

			//WAIT
			wait.until(ExpectedConditions.visibilityOfElementLocated(inputCiudadAlojamiento));
			Thread.sleep(2000);
			find(inputCiudadAlojamiento).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(inputCiudadAlojamiento));
			find(inputCiudadAlojamiento).clear();
			Thread.sleep(1000);
			ciudadAlojamiento = loadProperty.getProperty("ciudadAlojamiento");
			Thread.sleep(1000);
			find(inputCiudadAlojamiento).sendKeys(ciudadAlojamiento);
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(opcCiudadAlojamiento));
			find(opcCiudadAlojamiento).click();

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[Booking.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}

	public void ingresoFechas() {

		try {

			//OBJETO LOADPROPERTY
			Properties loadProperty = new Properties();	
			loadProperty.load(new FileReader("./params.properties"));
			WebDriverWait wait = new WebDriverWait(getDriver(),200);

			//WAIT
			wait.until(ExpectedConditions.visibilityOfElementLocated(fechaInicio));
			Thread.sleep(2000);
			find(fechaInicio).click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(fechaFin));
			find(fechaFin).click();
			Thread.sleep(2000);

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
			WebDriverWait wait = new WebDriverWait(getDriver(),200);

			//WAIT
			wait.until(ExpectedConditions.visibilityOfElementLocated(confirmarConsulta));
			Thread.sleep(2000);
			find(confirmarConsulta).click();
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
			wait.until(ExpectedConditions.visibilityOfElementLocated(validacionConsulta));
			Thread.sleep(2000);
			find(validacionConsulta).isVisible();
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
