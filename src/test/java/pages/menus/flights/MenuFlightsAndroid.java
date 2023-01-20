package pages.menus.flights;

import driverMobile.DriverContext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.AccionesGenericas;

public class MenuFlightsAndroid implements MenuFlights{
    AppiumDriver driver;

    public MenuFlightsAndroid(){
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Flights\"]")
    public MobileElement txtMenuFlights;

    @AndroidFindBy(id = "com.booking:id/bui_title_title")
    public MobileElement titleMenuFlights;

    @AndroidFindBy(id = "com.booking:id/search_box_radio_round_trip")
    public MobileElement checkBoxRoundTrip;

    @AndroidFindBy(id = "com.booking:id/search_box_radio_one_way")
    public MobileElement checkBoxOneWay;

    @AndroidFindBy(id = "com.booking:id/search_box_radio_multi_stop")
    public MobileElement checkBoxMultiCity;

    @AndroidFindBy(id = "com.booking:id/search_box_from_text_view")
    public MobileElement txtBoxFrom;

    @AndroidFindBy(id = "com.booking:id/search_box_to_text_view")
    public MobileElement txtBoxTo;

    @AndroidFindBy(id = "com.booking:id/search_box_when_text_view")
    public MobileElement txtBoxWhen;

    @AndroidFindBy(id = "com.booking:id/search_box_travellers_text_view")
    public MobileElement txtBoxTravellers;

    @AndroidFindBy(id = "com.booking:id/search_box_search_button")
    public MobileElement btnSearch;

    @AndroidFindBy(xpath = "//android.widget.Switch[@text=\"Direct flights only\"]")
    public MobileElement switchDirectFlights;

    @AndroidFindBy(id = "com.booking:id/emergency_text")
    public MobileElement txtCovidMessage;

    public void clickOnMenuFlights(String arg0){
        AccionesGenericas.validacionTextoElements(txtMenuFlights, arg0);
        AccionesGenericas.findAndClickElement(txtMenuFlights, 5);
    }

    public void validarExistenciaForm(){
        String titleVistaFlights, optRoundTrip, optOneWay, optMultiCity, txtDirectFlightsOnly, covidMessage;
        titleVistaFlights = "Find and book your next flight";
        optRoundTrip = "Round-trip";
        optOneWay = "One-way";
        optMultiCity = "Multi-city";
        txtDirectFlightsOnly = "Direct flights only";
        covidMessage = "Coronavirus (COVID-19) support";
        AccionesGenericas.visualizarObjeto(titleMenuFlights,5);
        AccionesGenericas.validacionTextoElements(titleMenuFlights, titleVistaFlights);
        AccionesGenericas.visualizarObjeto(checkBoxRoundTrip,5);
        AccionesGenericas.validacionTextoElements(checkBoxRoundTrip, optRoundTrip);
        AccionesGenericas.visualizarObjeto(checkBoxOneWay,5);
        AccionesGenericas.validacionTextoElements(checkBoxOneWay, optOneWay);
        AccionesGenericas.visualizarObjeto(checkBoxMultiCity,5);
        AccionesGenericas.validacionTextoElements(checkBoxMultiCity, optMultiCity);
        AccionesGenericas.visualizarObjeto(txtBoxFrom,5);
        AccionesGenericas.visualizarObjeto(txtBoxTo,5);
        AccionesGenericas.visualizarObjeto(txtBoxWhen,5);
        AccionesGenericas.visualizarObjeto(txtBoxTravellers,5);
        AccionesGenericas.visualizarObjeto(switchDirectFlights,5);
        AccionesGenericas.validacionTextoElements(switchDirectFlights, txtDirectFlightsOnly);
        AccionesGenericas.visualizarObjeto(txtCovidMessage,5);
        AccionesGenericas.validacionTextoElements(txtCovidMessage, covidMessage);
    }

    public void validarBotonSearch(String arg0){
        AccionesGenericas.visualizarObjeto(btnSearch,5);
        AccionesGenericas.validacionTextoElements(btnSearch, arg0);
    }


}
