package pages.menus.carRental;

import driverMobile.DriverContext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.AccionesGenericas;

public class MenuCarRentalAndroid implements MenuCarRental{
    AppiumDriver driver;

    public MenuCarRentalAndroid(){
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Car rental\"]")
    public MobileElement txtMenuCarRental;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Return to same location\"]")
    public MobileElement txtReturnSameLocation;

    @AndroidFindBy(id = "com.booking:id/search_box_same_location_toggle")
    public MobileElement switchReturnSameLocation;

    @AndroidFindBy(id = "com.booking:id/search_box_edit_pick_up_location")
    public MobileElement txtBoxPickUpLocation;

    @AndroidFindBy(id = "com.booking:id/bgoc_search_box_date_pick_up")
    public MobileElement txtBoxDatePickUp;

    @AndroidFindBy(id = "com.booking:id/search_box_time_pick_up")
    public MobileElement txtBoxTimePickUp;

    @AndroidFindBy(id = "com.booking:id/bgoc_search_box_date_drop_off")
    public MobileElement txtBoxDateDropOff;

    @AndroidFindBy(id = "com.booking:id/search_box_time_drop_off")
    public MobileElement txtBoxTimeDropOff;

    @AndroidFindBy(id = "com.booking:id/search_box_age_value")
    public MobileElement txtBoxEdades;

    @AndroidFindBy(id = "com.booking:id/search_box_btn_search")
    public MobileElement btnSearch;

    @AndroidFindBy(id = "com.booking:id/banner_description")
    public MobileElement lblBannerDesc;

    @AndroidFindBy(id = "com.booking:id/ape_rc_activity_search_form_terms_and_conditions")
    public MobileElement linkTyC;

    @AndroidFindBy(id = "com.booking:id/ape_rc_activity_search_form_privacy_policy")
    public MobileElement linkPrivacyPolicy;

    @AndroidFindBy(id = "com.booking:id/activity_search_form_contact_us")
    public MobileElement linkContactUs;

    public void clickOnMenuCarRental(String arg0){
        AccionesGenericas.validacionTextoElements(txtMenuCarRental, arg0);
        AccionesGenericas.findAndClickElement(txtMenuCarRental, 5);
    }

    public void validarExistenciaForm(){
        String valTxtReturn, valTxtViewYourCar, txtTyC, txtPrivacy, txtContactUs;
        valTxtReturn = "Return to same location";
        valTxtViewYourCar = "View and manage your car reservation";
        txtTyC = "Terms of service";
        txtPrivacy = "Privacy Notice";
        txtContactUs = "Contact us";
        AccionesGenericas.visualizarObjeto(txtReturnSameLocation,5);
        AccionesGenericas.validacionTextoElements(txtReturnSameLocation, valTxtReturn);
        AccionesGenericas.visualizarObjeto(switchReturnSameLocation,5);
        AccionesGenericas.visualizarObjeto(txtBoxPickUpLocation,5);
        AccionesGenericas.visualizarObjeto(txtBoxDatePickUp,5);
        AccionesGenericas.visualizarObjeto(txtBoxTimePickUp,5);
        AccionesGenericas.visualizarObjeto(txtBoxDateDropOff,5);
        AccionesGenericas.visualizarObjeto(txtBoxTimeDropOff,5);
        AccionesGenericas.visualizarObjeto(txtBoxEdades, 5);
        AccionesGenericas.visualizarObjeto(lblBannerDesc,5);
        AccionesGenericas.validacionTextoElements(lblBannerDesc, valTxtViewYourCar);
        AccionesGenericas.visualizarObjeto(linkTyC,5);
        AccionesGenericas.validacionTextoElements(linkTyC, txtTyC);
        AccionesGenericas.visualizarObjeto(linkPrivacyPolicy,5);
        AccionesGenericas.validacionTextoElements(linkPrivacyPolicy, txtPrivacy);
        AccionesGenericas.visualizarObjeto(linkContactUs,5);
        AccionesGenericas.validacionTextoElements(linkContactUs, txtContactUs);
    }

    public void validarBotonSearch(String arg0){
        AccionesGenericas.visualizarObjeto(btnSearch,5);
        AccionesGenericas.validacionTextoElements(btnSearch, arg0);
    }
}
