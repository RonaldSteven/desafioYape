package driverMobile;

import constants.OS;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public class DriverContext {

    private static DriverManager driverManager = new DriverManager();

    public static void setUp(OS os, String udId, String fileName){
        try {
            driverManager.resolveDriver(os, udId, fileName);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static AppiumDriver getDriver(){
        return driverManager.getDriver();
    }

    public static void quitDriver(){
        driverManager.getDriver().quit();
    }
}
