package pages.login;

import driverMobile.DriverContext;
import io.appium.java_client.ios.IOSDriver;

public interface Welcome {
    static Welcome pageObject(){
        Welcome welcomePage = null;
        if(DriverContext.getDriver() instanceof IOSDriver){
            welcomePage = null;
        }else{
            welcomePage = new WelcomeAndroid();
        }
        return welcomePage;
    }

    void visualizarDashboardBienvenida();
}
