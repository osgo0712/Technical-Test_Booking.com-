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

public class consultaAlquilerCochesStepPageObject extends PageObject{

	//VARIABLES GLOBALES
	String puntoEncuentro;

	static By btnModuloAlquilerCoches = generalElements.btnModuloAlquilerCoches.getValor_campo();
	static By inputLugarRecogida = generalElements.inputLugarRecogida.getValor_campo();
	static By btnConsultarAlquiler = generalElements.btnConsultarAlquiler.getValor_campo();
	static By opcLugarRecogida = generalElements.opcLugarRecogida.getValor_campo();
	static By validacionConsultaCoches = generalElements.validacionConsultaCoches.getValor_campo();


	@WhenPageOpens
	public void maximiseScreen() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		getDriver().manage().window().maximize();
		Thread.sleep(1000);
	}

	public void seleccionModulo() {

		try {
			//OBJETO LOADPROPERTY
			Properties loadProperty = new Properties();	
			loadProperty.load(new FileReader("./params.properties"));

			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(getDriver(),200);
			wait.until(ExpectedConditions.visibilityOfElementLocated(btnModuloAlquilerCoches));
			find(btnModuloAlquilerCoches).isVisible();
			Thread.sleep(1000);
			find(btnModuloAlquilerCoches).click();

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[Booking.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}

	}

	public void ingresoDestino() {

		try {
			//OBJETO LOADPROPERTY
			Properties loadProperty = new Properties();	
			loadProperty.load(new FileReader("./params.properties"));

			WebDriverWait wait = new WebDriverWait(getDriver(),200);
			wait.until(ExpectedConditions.visibilityOfElementLocated(inputLugarRecogida));
			find(inputLugarRecogida).isVisible();
			Thread.sleep(1000);
			find(inputLugarRecogida).click();
			Thread.sleep(1000);
			find(inputLugarRecogida).clear();
			Thread.sleep(1000);
			puntoEncuentro = loadProperty.getProperty("puntoEncuentro");
			find(inputLugarRecogida).sendKeys(puntoEncuentro);
			Thread.sleep(2000);
			find(opcLugarRecogida).click();

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[Booking.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}

	}

	public void seleccionBtnBuscar() {

		try {
			//OBJETO LOADPROPERTY
			Properties loadProperty = new Properties();	
			loadProperty.load(new FileReader("./params.properties"));

			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(getDriver(),200);
			wait.until(ExpectedConditions.visibilityOfElementLocated(btnConsultarAlquiler));
			find(btnConsultarAlquiler).isVisible();
			Thread.sleep(1000);


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
			wait.until(ExpectedConditions.visibilityOfElementLocated(btnConsultarAlquiler));
			Thread.sleep(2000);
			find(btnConsultarAlquiler).click();
			Thread.sleep(2000);
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
