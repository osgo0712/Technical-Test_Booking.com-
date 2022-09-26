package PageObject;

import org.openqa.selenium.By;

public enum generalElements {

	//HU CONSULTA ALOJAMIENTO
	inputCiudadAlojamiento (By.xpath("//input[@class='c-autocomplete__input sb-searchbox__input sb-destination__input']")),
	opcCiudadAlojamiento (By.xpath("//li[@class='c-autocomplete__item sb-autocomplete__item sb-autocomplete__item-with_photo sb-autocomplete__item__item--elipsis sb-autocomplete__item--icon_revamp sb-autocomplete__item--city '][1]")),
	btnModuloAlojamiento (By.xpath("(//span[@class='bui-tab__text'])[position()=1]")),
	fechaInicio (By.xpath("(//td[@class='bui-calendar__date'])[position()=1]")),
	fechaFin (By.xpath("(//td[@class='bui-calendar__date'])[position()=3]")),
	confirmarConsulta (By.xpath("(//span[@class='js-sb-submit-text '])[position()=1]")),
	validacionConsulta (By.xpath("//div[@class='rlt-left leftsmall']")),
	
	//HU CONSULTA VUELOS
	btnModuloVuelos (By.xpath("(//span[@class='bui-tab__text'])[position()=2]")),
	inputDestinoVuelo1 (By.xpath("(//input[@class='css-g0pg3f-SearchboxInput'])[position()=1]")),
	inputDestinoVuelo2 (By.xpath("//input[@class='css-1tl2oa1']")),
	opcCiudadDestino (By.xpath("(//div[@class='css-hboir5'])[position()=1]")),
	btnConsultar (By.xpath("(//button[@class='css-ya5gr9 wide'])[position()=1]")),
	validacionConsultaVuelos (By.xpath("//div[@class='css-hs3ck0']")),
	
	//HU CONSULTA ALQUILER COCHES
	btnModuloAlquilerCoches (By.xpath("(//span[@class='bui-tab__text'])[position()=3]")),
	inputLugarRecogida (By.xpath("(//input[@class='c-autocomplete__input sb-searchbox__input sb-destination__input'])[position()=1]")),
	btnConsultarAlquiler (By.xpath("(//button[@class='sb-searchbox__button '])[position()=1]")),
	opcLugarRecogida (By.xpath("(//li[@class='c-autocomplete__item sb-autocomplete__item sb-autocomplete__item-with_photo sb-autocomplete__item__item--elipsis sb-autocomplete__item--icon_revamp sb-autocomplete__item--airport '])[position()=1]")),
	validacionConsultaCoches (By.xpath("(//div[@class='SM_c734a667 SM_3d65ffdd SM_43fa6aec'])[position()=1]")),
	
	//HU CONSULTA SITIOS TURISTICOS
	btnModuloSitiosTuristicos (By.xpath("(//span[@class='bui-tab__text'])[position()=4]")),
	inputLugarAdondeVas (By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[3]/div/div/div[1]/form/div[1]/input")),
	opcLugarADondeVas (By.xpath("(//a[@class='css-1g3cue3'])[position()=1]")),
	inputFechas (By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[3]/div/div/div[1]/form/div[2]/div")),
	inputFechaInicio (By.xpath("(//span[@class='b21c1c6c83'])[position()=1]")),
	inputFechaFin (By.xpath("(//span[@class='b21c1c6c83'])[position()=3]")),
	btnConsultarSitio (By.xpath("(//button[@class='fc63351294 a822bdf511 d4b6b7a9e7 cfb238afa1 f4605622ad css-14gytlh'])[position()=1]")),
	validacionConsultaSitio (By.xpath("(//div[@class='a826ba81c4 fa71cba65b fa2f36ad22 afd256fc79 d08f526e0d ed11e24d01 ef9845d4b3'])[position()=1]")),
	
	//HU TAXIS AEROPUERTO
	btnModuloTaxisAeropuerto (By.xpath("(//span[@class='bui-tab__text'])[position()=5]")),
	inputLugarRecogidaTxi (By.xpath("(//input[@class='rw-location-input gb-u-position-static gb-o-interactive-field'])[position()=1]")),
	inputIndicaDestino (By.xpath("(//input[@class='rw-location-input gb-u-position-static gb-o-interactive-field'])[position()=2]")),
	btnConfirmarConsultaTaxis (By.xpath("(//button[@class='gb-o-btn gb-u-ease-out-02 gb-o-btn--primary gb-o-btn--horizontal ui-congo gb-c-search-form__submit-button'])[position()=1]")),
	opcRecogida (By.xpath("(//h4[@class='rw-autocomplete__item-title ui-clyde gb-u-bold gb-u-m0'])[position()=1]")),
	opcIndicaDestino (By.xpath("(//h4[@class='rw-autocomplete__item-title ui-clyde gb-u-bold gb-u-m0'])[position()=1]")),
	validacionConsultaTaxis (By.xpath("(//div[@class='gb-o-box gb-o-titled-box__content gb-o-titled-box__content--no-border'])[position()=1]"));
	

	
	private By valor_campo;

	private generalElements(By valor_campo) {
		this.valor_campo = valor_campo;
	}

	public By getValor_campo() {
		return valor_campo;
	}

	public void setValor_campo(By valor_campo) {
		this.valor_campo = valor_campo;
	}
	
}
