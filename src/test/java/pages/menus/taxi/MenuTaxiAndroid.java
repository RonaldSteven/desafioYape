package pages.menus.taxi;

import constants.SwipeDirections;
import driverMobile.DriverContext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.AccionesGenericas;

import java.util.List;

public class MenuTaxiAndroid implements MenuTaxi{

    AppiumDriver driver;

    public MenuTaxiAndroid(){
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Car rental\"]")
    public MobileElement txtMenuCarRental;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Taxi\"]")
    public List<MobileElement> txtMenuTaxi;

    @AndroidFindBy(id = "com.booking:id/close_icon")
    public MobileElement btnClose;

    @AndroidFindBy(id = "com.booking:id/splash_screen_title")
    public MobileElement titlePage;

    @AndroidFindBy(id = "com.booking:id/help_icon")
    public MobileElement iconHelp;

    @AndroidFindBy(id = "com.booking:id/splash_title")
    public MobileElement titleBienvenida;

    @AndroidFindBy(id = "com.booking:id/splash_subtitle")
    public MobileElement descTitleBienvenida;

    @AndroidFindBy(id = "com.booking:id/skip_text")
    public MobileElement btnSkip;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]")
    public MobileElement mapaGoogle;

    @AndroidFindBy(id = "com.booking:id/title_view")
    public MobileElement titleVista;

    @AndroidFindBy(id = "com.booking:id/subtitle_view")
    public MobileElement subTitleVista;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Enter pick-up location\"]")
    public MobileElement inputPickUpLocation;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Enter destination\"]")
    public MobileElement inputDestination;

    @AndroidFindBy(id = "com.booking:id/outbound_date")
    public MobileElement inputFecha;

    @AndroidFindBy(id = "com.booking:id/inbound_date")
    public MobileElement inputNeedReturn;

    @AndroidFindBy(id = "com.booking:id/search_taxis_button")
    public MobileElement btnSearchTaxis;

    public void clickOnMenuCarRental(String arg0){
        AccionesGenericas.swipeAndFindCarrusel(txtMenuCarRental, "Menu Superior 'Taxi'", SwipeDirections.LEFT, txtMenuTaxi);
        txtMenuTaxi.get(0).click();
    }

    public void validarTituloModalBienvenida(String arg0){
        AccionesGenericas.visualizarObjeto(titlePage,5);
        AccionesGenericas.validacionTextoElements(titlePage, arg0);
        AccionesGenericas.visualizarObjeto(btnClose,5);
        AccionesGenericas.visualizarObjeto(iconHelp,5);
    }

    public void validarTituloBienvenida(String arg0, String arg1){
        AccionesGenericas.visualizarObjeto(titleBienvenida,5);
        AccionesGenericas.validacionTextoElements(titleBienvenida, arg0);
        AccionesGenericas.visualizarObjeto(descTitleBienvenida,5);
        AccionesGenericas.validacionTextoElements(descTitleBienvenida, arg1);
    }

    public void visualizoBotonSkip(String arg0){
        AccionesGenericas.visualizarObjeto(btnSkip,5);
        AccionesGenericas.validacionTextoElements(btnSkip,arg0);
    }

    public void clicOnBtnSkip(){
        AccionesGenericas.findAndClickElement(btnSkip,5);
    }

    public void validarExistenciaForm(){
        String txtTitleVista, txtSubTitleVista;
        txtTitleVista = "Find a taxi for your trip";
        txtSubTitleVista = "Travel with ease – no lines, cash, or fees.";
        AccionesGenericas.visualizarObjeto(mapaGoogle,5);
        AccionesGenericas.visualizarObjeto(titleVista,5);
        AccionesGenericas.validacionTextoElements(titleVista, txtTitleVista);
        AccionesGenericas.visualizarObjeto(subTitleVista, 5);
        AccionesGenericas.validacionTextoElements(subTitleVista, txtSubTitleVista);
        AccionesGenericas.visualizarObjeto(inputPickUpLocation,5);
        AccionesGenericas.visualizarObjeto(inputDestination,5);
        AccionesGenericas.visualizarObjeto(inputFecha,5);
        AccionesGenericas.visualizarObjeto(inputNeedReturn,5);
    }

    public void validarBotonSeePrices(String arg0){
        AccionesGenericas.visualizarObjeto(btnSearchTaxis,5);
        AccionesGenericas.validacionTextoElements(btnSearchTaxis, arg0);
    }
}
