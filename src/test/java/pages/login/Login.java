package pages.login;

import driverMobile.DriverContext;
import io.appium.java_client.ios.IOSDriver;

public interface Login {

    static Login pageObject(){
        Login loginPage = null;
        if(DriverContext.getDriver() instanceof IOSDriver){
            loginPage = null;
        }else{
            loginPage = new LoginAndroid();
        }
        return loginPage;
    }
    void cerrarSignInPage();
    void checkVistaPrincipal(String arg0, String arg1);
    void validarBtnSignSocialMedia(String arg0);
    void validarBtnSignInOpts(String arg0, String arg1);
    void clickBtnSignWithEmail(String arg0);
    void setEmail(String arg0);
    void clickBtnContinueEnterEmail(String arg0);
    void setPassword(String arg0, String arg1, String arg3);
    void validarIncorrectPass(String arg0);
    void clickBtnSignIn(String arg0);
}
