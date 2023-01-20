package pages.menus.flights;

import driverMobile.DriverContext;
import io.appium.java_client.ios.IOSDriver;

public interface MenuFlights {

    static MenuFlights pageObject(){
        MenuFlights menuFlights = null;
        if(DriverContext.getDriver() instanceof IOSDriver){
            menuFlights = null;
        }else{
            menuFlights = new MenuFlightsAndroid();
        }
        return menuFlights;
    }

    void clickOnMenuFlights(String arg0);
    void validarExistenciaForm();
    void validarBotonSearch(String arg0);
}
