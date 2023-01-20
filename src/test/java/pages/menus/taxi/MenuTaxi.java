package pages.menus.taxi;

import driverMobile.DriverContext;
import io.appium.java_client.ios.IOSDriver;

public interface MenuTaxi {
    static MenuTaxi pageObject(){
        MenuTaxi menuTaxi = null;
        if(DriverContext.getDriver() instanceof IOSDriver){
            menuTaxi = null;
        }else{
            menuTaxi = new MenuTaxiAndroid();
        }
        return menuTaxi;
    }

    void clickOnMenuCarRental(String arg0);
    void validarTituloModalBienvenida(String arg0);
    void validarTituloBienvenida(String arg0, String arg1);
    void visualizoBotonSkip(String arg0);
    void clicOnBtnSkip();
    void validarExistenciaForm();
    void validarBotonSeePrices(String arg0);

}
