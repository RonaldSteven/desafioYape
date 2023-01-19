package pages.login;

import driverMobile.DriverContext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
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

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement btnCerrar;
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

    @AndroidFindBy(xpath = "//*[@text='Enter your email address']")
    public MobileElement lblTitleEnterEmail;

    @AndroidFindBy(xpath = "//*[contains(@text,'use this to sign')]")
    public MobileElement lblDescEnterEmail;

    @AndroidFindBy(id = "com.booking:id/identity_text_input_edit_text")
    public MobileElement txtEmailAddress;

    @AndroidFindBy(id = "com.booking:id/identity_landing_social_button_text")
    public MobileElement btnContinue;

    @AndroidFindBy(id = "com.booking:id/identity_header_title")
    public MobileElement lblTitleEnterPass;

    @AndroidFindBy(id = "com.booking:id/identity_header_description")
    public MobileElement lblDescTitleEnterPass;

    @AndroidFindBy(id = "com.booking:id/identity_text_input_edit_text")
    public MobileElement txtEnterPass;

    @AndroidFindBy(id = "com.booking:id/textinput_error")
    public MobileElement lblIncorrectPass;

    @AndroidFindBy(xpath = "//*[@text='Sign in']")
    public MobileElement btnSignInPass;

    public void cerrarSignInPage(){
        AccionesGenericas.findAndClickElement(btnCerrar,5);
    }

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

    public void setEmail(String arg0){
        AccionesGenericas.visualizarObjeto(lblTitleEnterEmail,5);
        AccionesGenericas.visualizarObjeto(lblDescEnterEmail, 5);
        txtEmailAddress.clear();
        txtEmailAddress.setValue(arg0);
        AccionesGenericas.validacionTextoElements(txtEmailAddress, arg0);
    }

    public void clickBtnContinueEnterEmail(String arg0){
        AccionesGenericas.validacionTextoElements(btnContinue, arg0);
        AccionesGenericas.findAndClickElement(btnContinue,5);
    }

    public void setPassword(String arg0, String arg1, String arg2){
        AccionesGenericas.visualizarObjeto(lblTitleEnterPass,5);
        AccionesGenericas.validacionTextoElements(lblTitleEnterPass, arg0);
        AccionesGenericas.visualizarObjeto(lblDescTitleEnterPass, 5);
        AccionesGenericas.validacionTextoElements(lblDescTitleEnterPass, arg1);
        txtEnterPass.clear();
        txtEnterPass.setValue(arg2);
    }

    public void validarIncorrectPass(String arg0){
        AccionesGenericas.visualizarObjeto(lblIncorrectPass,5);
        AccionesGenericas.validacionTextoElements(lblIncorrectPass, arg0);
    }

    public void clickBtnSignIn(String arg0){
        AccionesGenericas.validacionTextoElements(btnSignInPass, arg0);
        AccionesGenericas.findAndClickElement(btnSignInPass,5);
    }
}
