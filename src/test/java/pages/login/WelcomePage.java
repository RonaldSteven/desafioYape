package pages.login;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WelcomePage {

    @AndroidFindBy(id = "com.booking:id/genius_onbaording_bottomsheet_title")
    public MobileElement titleWelcome;

    @AndroidFindBy(id = "com.booking:id/genius_onbaording_bottomsheet_message")
    public MobileElement subtitleWelcome;

    @AndroidFindBy(id = "com.booking:id/genius_onbaording_bottomsheet_cta")
    public MobileElement btnStartSearching;

}
