package utils;

import driverMobile.DriverContext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.functions.AppiumFunction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AccionesGenericas {

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
        }catch (NoSuchElementException e){
            System.out.println("No se encontro objeto: "+element+" se retorna false. Se genero la siguiente excepcion: "+e.getMessage());
        }
    }
}
