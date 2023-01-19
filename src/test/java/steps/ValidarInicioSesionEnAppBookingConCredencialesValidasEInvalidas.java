package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.login.Login;
import pages.login.Welcome;

public class ValidarInicioSesionEnAppBookingConCredencialesValidasEInvalidas {
    @Given("Soy un nuevo usuario de la aplicacion movil de Booking")
    public void soyUnNuevoUsuarioDeLaAplicacionMovilDeBooking() {
    }

    @When("Me encuentro en la pagina principal valido la existencia del titulo {string} y {string}")
    public void meEncuentroEnLaPaginaPrincipalValidoLaExistenciaDelTituloY(String arg0, String arg1) {
        System.out.println("STEP - Me encuentro en la pagina principal valido la existencia del titulo "+arg0+" y "+arg1);
        Login.pageObject().checkVistaPrincipal(arg0, arg1);
    }

    @And("Visualizo los botones {string}, {string}, {string} y {string}")
    public void visualizoLosBotonesY(String arg0, String arg1, String arg2, String arg3) {
        System.out.println("STEP - Visualizo los botones "+arg0+", "+arg1+", "+arg2+" y "+arg3);
        Login.pageObject().validarBtnSignSocialMedia(arg0);
        Login.pageObject().validarBtnSignInOpts(arg1, arg2);
        Login.pageObject().validarBtnSignSocialMedia(arg3);

    }

    @And("Presiono el boton {string}")
    public void presionoElBoton(String arg0) {
        System.out.println("STEP - Presiono el boton "+arg0);
        Login.pageObject().clickBtnSignWithEmail(arg0);
    }

    @Then("Visualizo la vista con titulo {string} y {string}")
    public void visualizoLaVistaConTituloY(String arg0, String arg1) {
        System.out.println("STEP - Visualizo la vista con titulo "+arg0+" y "+arg1);

    }

    @And("Ingreso correo {string}")
    public void ingresoCorreo(String arg0) {
        System.out.println("STEP - Ingreso correo "+arg0);
        Login.pageObject().setEmail(arg0);
    }

    @And("Presiono boton {string} en la vista Enter your email address")
    public void presionoBotonEnLaVistaEnterYourEmailAddress(String arg0) {
        System.out.println("STEP - Presiono boton "+arg0+" en la vista Enter your email address");
        Login.pageObject().clickBtnContinueEnterEmail(arg0);
    }

    @Then("Visualizo la vista con titulo {string} y {string} e ingreso password {string}")
    public void visualizoLaVistaConTituloYEIngresoPassword(String arg0, String arg1, String arg2) {
        System.out.println("STEP - Visualizo la vista con titulo "+arg0+" y "+arg1+" e ingreso una password "+arg2);
        Login.pageObject().setPassword(arg0,arg1,arg2);

    }

    @And("Presiono boton {string} en la vista Enter your password")
    public void presionoBotonEnLaVistaEnterYourPassword(String arg0) {
        System.out.println("STEP - Presiono boton "+arg0+" en la vista Enter your password");
        Login.pageObject().clickBtnSignIn(arg0);
    }

    @Then("Debo ver un mensaje de bienvenida en la pantalla de mi cuenta")
    public void deboVerUnMensajeDeBienvenidaEnLaPantallaDeMiCuenta() {
        System.out.println("STEP - Debo ver un mensaje de bienvenida en la pantalla de mi cuenta");
        Welcome.pageObject().visualizarDashboardBienvenida();
    }

    @Then("Visualizo mensaje de error {string}")
    public void visualizoMensajeDeError(String arg0) {
        System.out.println("STEP - Visualizo mensaje de error "+arg0);
        Login.pageObject().validarIncorrectPass(arg0);
    }

    @And("Presiono el boton X")
    public void presionoElBotonX() {
        System.out.println("STEP - Presiono el boton X");
        Login.pageObject().cerrarSignInPage();
    }
}
