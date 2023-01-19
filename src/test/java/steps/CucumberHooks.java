package steps;


import constants.OS;
import driverMobile.DriverContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {

    @Before
    public void beforeScenario(){
        DriverContext.setUp(OS.ANDROID, "emulator-5554", "booking-com-32-9");
    }

    @After
    public void afterScenario(){
        DriverContext.quitDriver();
    }

}
