package pages.menus.stays;

import driverMobile.DriverContext;
import io.appium.java_client.ios.IOSDriver;

public interface MenuStays {

    static MenuStays pageObject(){
        MenuStays menuStays = null;
        if(DriverContext.getDriver() instanceof IOSDriver){
            menuStays = null;
        }else{
            menuStays = new MenuStaysAndroid();
        }
        return menuStays;
    }

    void validarExistenciaForm();
    void validarSeleccionMenuStays(String arg0);
    void validarBotonSearch(String arg0);
}
