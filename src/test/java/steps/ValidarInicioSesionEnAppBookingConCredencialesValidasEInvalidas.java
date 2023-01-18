package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.login.Login;

public class ValidarInicioSesionEnAppBookingConCredencialesValidasEInvalidas {
    @Given("Soy un nuevo usuario de la aplicacion movil de Booking")
    public void soyUnNuevoUsuarioDeLaAplicacionMovilDeBooking() {
    }

    @When("Me encuentro en la pagina principal valido la existencia del titulo {string} y {string}")
    public void meEncuentroEnLaPaginaPrincipalValidoLaExistenciaDelTituloY(String arg0, String arg1) {
        System.out.println("Que paso");
        Login.pageObject().checkVistaPrincipal(arg0, arg1);
    }

    @And("Visualizo los botones {string}, {string}, {string} y {string}")
    public void visualizoLosBotonesY(String arg0, String arg1, String arg2, String arg3) {
    }

    @And("Presiono el boton {string}")
    public void presionoElBoton(String arg0) {
    }

    @Then("Visualizo la vista con titulo {string} y {string}")
    public void visualizoLaVistaConTituloY(String arg0, String arg1) {
    }

    @And("Ingreso correo {string}")
    public void ingresoCorreo(String arg0) {
    }

    @And("Presiono boton {string}")
    public void presionoBoton(String arg0) {
    }

    @And("Ingreso una password valida")
    public void ingresoUnaPasswordValida() {
    }

    @Then("Debo ver un mensaje de bienvenida en la pantalla de mi cuenta")
    public void deboVerUnMensajeDeBienvenidaEnLaPantallaDeMiCuenta() {
    }
}
