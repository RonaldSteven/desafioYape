package pages.login;

import driverMobile.DriverContext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.AccionesGenericas;

public class WelcomeAndroid implements Welcome{

    AppiumDriver driver;

    public WelcomeAndroid(){
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    @AndroidFindBy(id = "com.booking:id/genius_onbaording_bottomsheet_title")
    public MobileElement lblTitleWelcome;

    @AndroidFindBy(id = "com.booking:id/genius_onbaording_bottomsheet_message")
    public MobileElement lblDescTitleWelcome;

    @AndroidFindBy(id = "com.booking:id/genius_onbaording_bottomsheet_secondary_cta")
    public MobileElement lblLinkLearnMore;

    @AndroidFindBy(id = "com.booking:id/genius_onbaording_bottomsheet_cta")
    public MobileElement btnStartSearching;

    public void visualizarDashboardBienvenida(){
        AccionesGenericas.visualizarObjeto(lblTitleWelcome,5);
        AccionesGenericas.visualizarObjeto(lblDescTitleWelcome,5);
        AccionesGenericas.visualizarObjeto(lblLinkLearnMore,5);
        AccionesGenericas.visualizarObjeto(btnStartSearching,5);

    }

}
