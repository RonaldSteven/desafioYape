package pages.menus;

import driverMobile.DriverContext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class MenuCarRentalAndroid {

    AppiumDriver driver;

    public MenuCarRentalAndroid(){
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }




}
