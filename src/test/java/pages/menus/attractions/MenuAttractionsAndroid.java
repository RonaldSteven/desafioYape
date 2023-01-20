package pages.menus.attractions;

import constants.SwipeDirections;
import driverMobile.DriverContext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.AccionesGenericas;

import java.util.List;

public class MenuAttractionsAndroid implements MenuAttractions{

    AppiumDriver driver;

    public MenuAttractionsAndroid(){
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Car rental\"]")
    public MobileElement txtMenuCarRental;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Attractions\"]")
    public List<MobileElement> txtMenuAttractions;

    @AndroidFindBy(xpath = "//android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[@text=\"Find and book a great experience\"]")
    public MobileElement txtTituloVista;

    @AndroidFindBy(xpath = "//android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[@text=\"Discover more of your destination and make the most of your trip\"]")
    public MobileElement txtSubTituloVista;

    @AndroidFindBy(xpath = "//android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View//android.view.View//android.view.View/android.widget.EditText")
    public MobileElement txtBoxWhere;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View")
    public MobileElement txtBoxFechas;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Search\"]")
    public MobileElement btnSearch;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Check local guidelines before planning your visit. \"]")
    public MobileElement msgCheckLocal;

    @AndroidFindBy(xpath = "//android.view.View[@text=\"Nearby destinations\"]")
    public MobileElement lblNearbyDest;

    public void clickOnMenuAttractions(String arg0){
        AccionesGenericas.swipeAndFindCarrusel(txtMenuCarRental, "Menu Superior 'Taxi'", SwipeDirections.LEFT, txtMenuAttractions);
        txtMenuAttractions.get(0).click();
    }

    public void validarExistenciaForm(){
        String txtTitleVista, txtSubTitleVista, txtMsgCheckLocal, txtLblNearbyDest;
        txtTitleVista = "Find and book a great experience";
        txtSubTitleVista = "Discover more of your destination and make the most of your trip";
        txtMsgCheckLocal = "Check local guidelines before planning your visit. ";
        txtLblNearbyDest = "Nearby destinations";
        AccionesGenericas.visualizarObjeto(txtTituloVista,5);
        AccionesGenericas.validacionTextoElements(txtTituloVista, txtTitleVista);
        AccionesGenericas.visualizarObjeto(txtSubTituloVista,5);
        AccionesGenericas.validacionTextoElements(txtSubTituloVista, txtSubTitleVista);
        AccionesGenericas.visualizarObjeto(txtBoxWhere,5);
        AccionesGenericas.visualizarObjeto(txtBoxFechas,5);
        AccionesGenericas.visualizarObjeto(msgCheckLocal,5);
        AccionesGenericas.validacionTextoElements(msgCheckLocal, txtMsgCheckLocal);
        AccionesGenericas.visualizarObjeto(lblNearbyDest,5);
        AccionesGenericas.validacionTextoElements(lblNearbyDest, txtLblNearbyDest);
    }

    public void validarBotonSearch(String arg0){
        AccionesGenericas.visualizarObjeto(btnSearch,5);
        AccionesGenericas.validacionTextoElements(btnSearch, arg0);
    }


}
