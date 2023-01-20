package pages.menus.carRental;

import driverMobile.DriverContext;
import io.appium.java_client.ios.IOSDriver;

public interface MenuCarRental {
    static MenuCarRental pageObject(){
        MenuCarRental menuCarRental = null;
        if(DriverContext.getDriver() instanceof IOSDriver){
            menuCarRental = null;
        }else{
            menuCarRental = new MenuCarRentalAndroid();
        }
        return menuCarRental;
    }

    void clickOnMenuCarRental(String arg0);
    void validarExistenciaForm();
    void validarBotonSearch(String arg0);
}
