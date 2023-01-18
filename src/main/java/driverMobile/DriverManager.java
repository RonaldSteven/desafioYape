package driverMobile;

import constants.OS;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {
    private DesiredCapabilities caps = new DesiredCapabilities();

    private AppiumDriver driver;

//    private File root = new File("apps");
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
//        caps.setCapability("allowInvisibleElements", true);
//        caps.setCapability("enableMultiWindows", true);
//        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulador Android");
//        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
//        //caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
//        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
//        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 400000);
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Device Android");
//        caps.setCapability(MobileCapabilityType.FULL_RESET, true);
//        caps.setCapability(MobileCapabilityType.NO_RESET, false);
        app = new File(root.getAbsolutePath(), fileName + ".apk").toString();
        String osName = System.getProperty("os.name");
        if(osName.contains("Windows")){
            app = app.replace("\\", "\\\\");
        }
        caps.setCapability("app", app);
//        caps.setCapability("app", "S:\\workspace\\Desafio Yape\\restful-booker\\apps\\booking-com-32-9.apk");
//        caps.setCapability(MobileCapabilityType.APP, app);
        this.driver = new AndroidDriver(new URL(server), caps);
    }

    protected AppiumDriver getDriver(){
        return driver;
    }
}
