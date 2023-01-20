package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.menus.carRental.MenuCarRental;
import pages.menus.flights.MenuFlights;
import pages.menus.stays.MenuStays;
import pages.menus.taxi.MenuTaxi;

public class ValidarDespliegueCorrectoModulosReservas {
    @Then("Debo visualizar que menu {string} se encuentre seleccionado")
    public void deboVisualizarQueMenuSeEncuentreSeleccionado(String arg0) {
        System.out.println("STEP - Debo visualizar que menu "+arg0+" se encuentre seleccionado");
        MenuStays.pageObject().validarSeleccionMenuStays(arg0);
    }

    @And("Debo visualizar formulario {string}")
    public void deboVisualizarFormulario(String arg0) {
        System.out.println("STEP - Debo visualizar formulario "+arg0);
        switch (arg0){
            case "Stays":
                MenuStays.pageObject().validarExistenciaForm();
                break;
            case "Flights":
                MenuFlights.pageObject().validarExistenciaForm();
                break;
            case "Car rental":
                MenuCarRental.pageObject().validarExistenciaForm();
                break;
            case "Taxi":
                MenuTaxi.pageObject().validarExistenciaForm();
                break;
            case "Attractions":
                //Metodo
                break;
        }
    }

    @And("Visualizo boton {string} para buscar hoteles")
    public void visualizoBotonParaBuscarHoteles(String arg0) {
        System.out.println("STEP - Visualizo boton "+arg0+" para buscar hoteles");
        MenuStays.pageObject().validarBotonSearch(arg0);
    }

    @And("Selecciono del menu superior la opcion {string}")
    public void seleccionoDelMenuSuperiorLaOpcion(String arg0) {
        System.out.println("STEP - Selecciono del menu superior la opcion "+arg0);
        switch (arg0){
            case "Flights":
                MenuFlights.pageObject().clickOnMenuFlights(arg0);
                break;
            case "Car rental":
                MenuCarRental.pageObject().clickOnMenuCarRental(arg0);
                break;
            case "Taxi":
                MenuTaxi.pageObject().clickOnMenuCarRental(arg0);
                break;
            case "Attractions":
                //Metodo
                break;
        }
    }

    @And("Visualizo boton {string} para buscar vuelos")
    public void visualizoBotonParaBuscarVuelos(String arg0) {
        System.out.println("STEP - Visualizo boton "+arg0+" para buscar vuelos");
        MenuFlights.pageObject().validarBotonSearch(arg0);
    }

    @And("Visualizo boton {string} para alquilar auto")
    public void visualizoBotonParaAlquilarAuto(String arg0) {
        System.out.println("STEP - Visualizo boton "+arg0+" para alquilar auto");
        MenuCarRental.pageObject().validarBotonSearch(arg0);
    }

    @Then("Debo visualizar modal con titulo {string}")
    public void deboVisualizarModalConTitulo(String arg0) {
        System.out.println("STEP - Debo visualizar modal con titulo "+arg0);
        MenuTaxi.pageObject().validarTituloModalBienvenida(arg0);
    }

    @And("Visualizo titulo {string} y descripcion {string} de bienvenida")
    public void visualizoTituloYDescripcionDeBienvenida(String arg0, String arg1) {
        System.out.println("STEP - Visualizo titulo "+arg0+" y descripcion "+arg1+" de bienvenida");
        MenuTaxi.pageObject().validarTituloBienvenida(arg0,arg1);
    }

    @And("Visualizo boton {string}")
    public void visualizoBoton(String arg0) {
        System.out.println("STEP - Visualizo boton "+arg0);
        MenuTaxi.pageObject().visualizoBotonSkip(arg0);
    }

    @And("Presiono boton {string}")
    public void presionoBotonSkip(String arg0) {
        System.out.println("STEP - Presiono boton "+arg0);
        MenuTaxi.pageObject().clicOnBtnSkip();
    }

    @And("Visualizo boton {string} para buscar taxis")
    public void visualizoBotonParaBuscarTaxis(String arg0) {
        System.out.println("STEP - Visualizo boton "+arg0+" para buscar taxis");
        MenuTaxi.pageObject().validarBotonSeePrices(arg0);
    }

    @And("Visualizo boton {string} para buscar atracciones")
    public void visualizoBotonParaBuscarAtracciones(String arg0) {
        System.out.println("STEP - Visualizo boton "+arg0+" para buscar atracciones");
    }
}
