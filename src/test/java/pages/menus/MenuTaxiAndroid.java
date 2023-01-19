package pages.menus;

import driverMobile.DriverContext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class MenuTaxiAndroid {

    AppiumDriver driver;

    public MenuTaxiAndroid(){
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

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
}
