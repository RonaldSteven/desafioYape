package pages.login;

import driverMobile.DriverContext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.support.PageFactory;
import utils.AccionesGenericas;

import java.util.ArrayList;
import java.util.List;

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

    //Corresponde a botones Sign in with email y Create your account
    @AndroidFindBy(id = "com.booking:id/identity_landing_social_button_text")
    public List<MobileElement> listBtnSingInSocialMedia;

    //Corresponde a botones Sign in with Google y Sign in with Facebook
    @AndroidFindBy(id = "com.booking:id/auth_bui_button")
    public List<MobileElement> listBtnSignInOpt;

    public void checkVistaPrincipal(String arg0, String arg1){
        AccionesGenericas.visualizarObjeto(titleSignIn, 5);
        AccionesGenericas.visualizarObjeto(titleDescSingIn,5);
        AccionesGenericas.validacionTextoElements(titleSignIn, arg0);
        AccionesGenericas.validacionTextoElements(titleDescSingIn, arg1);
    }

    public void validarBtnSignSocialMedia(String arg0){
        for (MobileElement element:listBtnSingInSocialMedia) {
            if(element.getText().equals(arg0)){
                AccionesGenericas.visualizarObjeto(element, 5);
                AccionesGenericas.validacionTextoElements(element, arg0);
                break;
            }else{
                System.out.println("Elemento no corresponde al esperado");
            }
        }
    }
    public void validarBtnSignInOpts(String arg0, String arg1){
        List<String> listBtnOpts = new ArrayList<>();
        listBtnOpts.add(arg0);
        listBtnOpts.add(arg1);
        int posList = 0;
        for (MobileElement element:listBtnSignInOpt) {
            AccionesGenericas.visualizarObjeto(element, 5);
            AccionesGenericas.validacionTextoElements(element, listBtnOpts.get(posList));
            posList=+1;
        }
    }

    public void clickBtnSignWithEmail(String arg0){
        for (MobileElement element:listBtnSingInSocialMedia) {
            if(element.getText().equals(arg0)){
                AccionesGenericas.findAndClickElement(element, 5);
                break;
            }else{
                System.out.println("Elemento no corresponde al esperado");
            }
        }
    }
}
