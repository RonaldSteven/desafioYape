package utils;

import constants.SwipeDirections;
import driverMobile.DriverContext;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class AccionesGenericas {

    public static Dimension screenSize = DriverContext.getScreenSize();
    private static Dimension size;
    private static TouchAction touchAction;

    public static boolean visualizarObjeto(MobileElement element, int segundos){
        try {
            System.out.println("Buscamos el objeto: "+element+", esperamos "+segundos+" segundos hasta que aparezca.");
            WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), (long)segundos);
            wait.until(ExpectedConditions.visibilityOf(element));;
            System.out.println("Se encontro objeto: "+element+" se retorna true");
            return true;
        }catch (NoSuchElementException e){
            System.out.println("No se encontro objeto: "+element+" se retorna false. Se genero la siguiente excepcion: "+e.getMessage());
            return false;
        }
    }

    public static void validacionTextoElements(MobileElement element, String textoEsperado){
        String actualText = element.getText();
        try{
            assertEquals(textoEsperado, actualText);
        }catch (NoSuchElementException e){
            System.out.println("No se encontro objeto: "+element+" se retorna false. Se genero la siguiente excepcion: "+e.getMessage());
        }
    }

    public static void findAndClickElement(MobileElement element, int segundos){
        try {
            System.out.println("Buscamos el objeto: "+element+", esperamos "+segundos+" segundos hasta que aparezca.");
            WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), (long)segundos);
            wait.until(ExpectedConditions.visibilityOf(element));;
            System.out.println("Se encontro objeto: "+element+" se retorna true");
            element.click();
            System.out.println("Se hace click al objeto: "+element);
        }catch (NoSuchElementException e){
            System.out.println("No se encontro objeto: "+element+" se retorna false. Se genero la siguiente excepcion: "+e.getMessage());
        }
    }

    public static boolean swipeAndFindCarrusel(MobileElement element, String nameElement, SwipeDirections direction, List<MobileElement> findElements) {
        boolean foundElement = false;
        int anchorX, anchorY;
        try {
            int contador = 0;
            do {
                if(findElements.size() > 0){
                    MobileElement findElement = findElements.get(0);
                    foundElement = findElement.isDisplayed();
                }
                if (foundElement) {
                    System.out.println("[Acciones Genericas - Swipe and Find Carrusel] Se encuentra elemento " + nameElement);
                } else {
                    System.out.println("[Acciones Genericas - Swipe and Find Carrusel] Se hace swipe para buscar elemento " + nameElement);
                    try {
//                        anchorX = (int) Math.round((double) screenSize.width);
//                        if (contador == 0) {
//
//                        } else {
//                            anchorY = Math.round((float) element.getCenter().y);
//                        }
                        anchorX = (int) Math.round((double) screenSize.width);
                        anchorY = Math.round((float) element.getCenter().y);
                        PointOption end = null;
                        PointOption start = null;
                        switch (direction) {
                            case LEFT:
                                start = PointOption.point((int) Math.round((double) anchorX * 0.900), anchorY);
                                end = PointOption.point((int) Math.round(anchorX * 0.200), anchorY);
                                break;
                            case RIGHT:
                                end = PointOption.point((int) Math.round((double) anchorX * 0.900), anchorY);
                                start = PointOption.point((int) Math.round(anchorX * 0.200), anchorY);
                                break;
                        }
                        try {
                            (new TouchAction(DriverContext.getDriver())).press(start).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000L))).moveTo(end).release().perform();

                        } catch (Exception ex) {

                        }
                    } catch (NoSuchElementException e) {
                        System.out.println("[Acciones Genericas - swipeAndFindCarrusel] No se encuentra el elemento " + nameElement);
                    }
                    contador++;
                }
            } while (foundElement == false && contador < 6);
        } catch (Exception ex) {
            System.out.println("[Acciones Genericas - swipeAndFindCarrusel] No se encuentra el elemento " + nameElement);
        }
        return foundElement;
    }



}
