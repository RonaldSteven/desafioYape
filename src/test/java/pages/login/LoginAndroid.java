package pages.login;

import driverMobile.DriverContext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.AccionesGenericas;

public class LoginAndroid implements Login{

    AppiumDriver driver;

    public LoginAndroid(){
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    @AndroidFindBy(id = "com.booking:id/identity_header_title")
    public MobileElement titleSignIn;

    @AndroidFindBy(id = "com.booking:id/identity_header_description")
    public MobileElement titleDescSingIn;

    @AndroidFindBy(id = "com.booking:id/identity_landing_social_button_text")
    public MobileElement btnSingInEmail;

    public void checkVistaPrincipal(String arg0, String arg1){
        AccionesGenericas.visualizarObjeto(titleSignIn, 5);
        AccionesGenericas.visualizarObjeto(titleDescSingIn,5);
        AccionesGenericas.validacionTextoElements(titleSignIn, arg0);
        AccionesGenericas.validacionTextoElements(titleDescSingIn, arg1);
    }
}
