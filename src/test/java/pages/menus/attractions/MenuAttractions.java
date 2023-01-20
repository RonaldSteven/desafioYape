package pages.menus.attractions;

import driverMobile.DriverContext;
import io.appium.java_client.ios.IOSDriver;

public interface MenuAttractions {
    static MenuAttractions pageObject(){
        MenuAttractions menuAttractions = null;
        if(DriverContext.getDriver() instanceof IOSDriver){
            menuAttractions = null;
        }else{
            menuAttractions = new MenuAttractionsAndroid();
        }
        return menuAttractions;
    }
}
