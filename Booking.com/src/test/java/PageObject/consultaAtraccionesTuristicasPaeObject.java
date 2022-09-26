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

public class consultaAtraccionesTuristicasPaeObject extends PageObject{

	//VARIABLES GLOBALES
	String ciudadTuristica;

	static By btnModuloSitiosTuristicos = generalElements.btnModuloSitiosTuristicos.getValor_campo();
	static By inputLugarAdondeVas = generalElements.inputLugarAdondeVas.getValor_campo();
	static By opcLugarADondeVas = generalElements.opcLugarADondeVas.getValor_campo();
	static By inputFechas = generalElements.inputFechas.getValor_campo();
	static By inputFechaInicio = generalElements.inputFechaInicio.getValor_campo();
	static By inputFechaFin = generalElements.inputFechaFin.getValor_campo();
	static By btnConsultarSitio = generalElements.btnConsultarSitio.getValor_campo();
	static By validacionConsultaSitio = generalElements.validacionConsultaSitio.getValor_campo();



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
			wait.until(ExpectedConditions.visibilityOfElementLocated(btnModuloSitiosTuristicos));
			find(btnModuloSitiosTuristicos).isVisible();
			Thread.sleep(1000);
			find(btnModuloSitiosTuristicos).click();

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[Booking.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}

	}
	public void ingresoSitioTuristico() {

		try {

			//OBJETO LOADPROPERTY
			Properties loadProperty = new Properties();	
			loadProperty.load(new FileReader("./params.properties"));
			WebDriverWait wait = new WebDriverWait(getDriver(),200);

			//WAIT
			wait.until(ExpectedConditions.visibilityOfElementLocated(inputLugarAdondeVas));
			Thread.sleep(2000);
			find(inputLugarAdondeVas).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(inputLugarAdondeVas));
			find(inputLugarAdondeVas).clear();
			Thread.sleep(1000);
			ciudadTuristica = loadProperty.getProperty("ciudadTuristica");
			Thread.sleep(1000);
			find(inputLugarAdondeVas).sendKeys(ciudadTuristica);
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(opcLugarADondeVas));
			find(opcLugarADondeVas).click();
			Thread.sleep(5000);

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
			wait.until(ExpectedConditions.visibilityOfElementLocated(inputFechas));
			Thread.sleep(2000);
			find(inputFechas).click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(inputFechaInicio));
			find(inputFechaInicio).click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(inputFechaFin));
			find(inputFechaFin).click();
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
			wait.until(ExpectedConditions.visibilityOfElementLocated(btnConsultarSitio));
			Thread.sleep(2000);
			find(btnConsultarSitio).click();
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
			wait.until(ExpectedConditions.visibilityOfElementLocated(validacionConsultaSitio));
			Thread.sleep(2000);
			find(validacionConsultaSitio).isVisible();
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
