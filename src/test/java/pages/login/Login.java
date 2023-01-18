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

    void checkVistaPrincipal(String arg0, String arg1);
    void validarBtnSignSocialMedia(String arg0);
    void validarBtnSignInOpts(String arg0, String arg1);
    void clickBtnSignWithEmail(String arg0);
}
