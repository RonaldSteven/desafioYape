package pages.menus;

import driverMobile.DriverContext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class MenuStaysAndroid {

    AppiumDriver driver;

    public MenuStaysAndroid(){
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    /**
     * Tab superior de menus
     */
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Flights\"]")
    public MobileElement txtMenuFlights;


}
