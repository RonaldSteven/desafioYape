package pages.menus.stays;

import driverMobile.DriverContext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import utils.AccionesGenericas;

public class MenuStaysAndroid implements MenuStays{

    AppiumDriver driver;

    public MenuStaysAndroid(){
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Stays\"]")
    public MobileElement txtMenuStays;

    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_destination")
    public MobileElement txtboxEnterYourDirection;
    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_dates")
    public MobileElement txtboxIndicarFechas;

    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_occupancy")
    public MobileElement txtboxOcupantes;

    /**
     * Inicio seleccion de dias y mes
     */
    @AndroidFindBy(id = "com.booking:id/facet_date_picker_selection_summary")
    public MobileElement txtDatePicker;

    @AndroidFindBy(id = "com.booking:id/facet_date_picker_confirm")
    public MobileElement btnSelectDates;
    /**
     * Fin seleccion de dias y mes
     */

    @AndroidFindBy(id = "com.booking:id/facet_search_box_cta")
    public MobileElement btnSearch;

    @AndroidFindBy(id = "com.booking:id/emergency_text")
    public MobileElement txtCovidMessage;

    @AndroidFindBy(id = "com.booking:id/bui_banner_text")
    public MobileElement txtSignIn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Sign in now\"]")
    public MobileElement btnSignInNow;

    public void validarExistenciaForm(){
        String covidMessage, signInMessage, txtBtnSignInNow;
        covidMessage = "Get the latest COVID-19 travel advice";
        signInMessage = "Sign in to manage your bookings";
        txtBtnSignInNow = "Sign in now";
        AccionesGenericas.visualizarObjeto(txtboxEnterYourDirection,5);
        AccionesGenericas.visualizarObjeto(txtboxIndicarFechas,5);
        AccionesGenericas.visualizarObjeto(txtboxOcupantes,5);
        AccionesGenericas.visualizarObjeto(txtCovidMessage,5);
        AccionesGenericas.validacionTextoElements(txtCovidMessage, covidMessage);
        AccionesGenericas.visualizarObjeto(txtSignIn, 5);
        AccionesGenericas.validacionTextoElements(txtSignIn, signInMessage);
        AccionesGenericas.visualizarObjeto(btnSignInNow, 5);
        AccionesGenericas.validacionTextoElements(btnSignInNow, txtBtnSignInNow);
    }
    public void validarSeleccionMenuStays(String arg0){
        boolean isSelected = false;
        AccionesGenericas.visualizarObjeto(txtMenuStays,5);
        AccionesGenericas.validacionTextoElements(txtMenuStays, arg0);
        if(txtMenuStays.getAttribute("selected").equals("true")){
            isSelected = true;
            Assert.assertTrue("Menu "+arg0+" se encuentra seleccionado - Valor atributo [selected]: "+txtMenuStays.getAttribute("selected"),isSelected);
        }else{
            Assert.assertFalse("No se puede validar que menu "+arg0+" se encuentre seleccionado - Valor atributo [selected]: "+txtMenuStays.getAttribute("selected"),false);
        }
    }

    public void validarBotonSearch(String arg0){
        AccionesGenericas.visualizarObjeto(btnSearch,5);
        AccionesGenericas.validacionTextoElements(btnSearch, arg0);
    }

    public void seleccionarFechas(){
        System.out.println("Se presiona textBox para indicar fechas");
        txtboxIndicarFechas.click();
        System.out.println("Se procede a modificar fechas de estadia");
    }

}
