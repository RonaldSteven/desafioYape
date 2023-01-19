package driverMobile;

import constants.OS;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {
    private DesiredCapabilities caps = new DesiredCapabilities();

    private AppiumDriver driver;

    private File root = new File("apps");

    protected void resolveDriver(OS os, String udId, String fileName) throws MalformedURLException {
        String server = null;
        try {
            server = "http://127.0.0.1:4723/wd/hub";
        }catch (Exception e){
            e.printStackTrace();
        }

        String app;
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("platformVersion", "12.0");
        caps.setCapability("automationName", "Appium");
        caps.setCapability("newCommandTimeout", "60");
        app = new File(root.getAbsolutePath(), fileName + ".apk").toString();
        String osName = System.getProperty("os.name");
        if(osName.contains("Windows")){
            app = app.replace("\\", "\\\\");
        }
        caps.setCapability("app", app);
        this.driver = new AndroidDriver(new URL(server), caps);
    }

    protected AppiumDriver getDriver(){
        return driver;
    }

    protected Dimension getScreenSize(){
        return driver.manage().window().getSize();
    }
}
