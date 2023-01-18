@BSPID0001
Feature: Validar inicio de sesion en app Booking con credenciales validas e invalidas.

  @TSCID110001
  Scenario: 01 - Iniciar sesión con credenciales válidas
    Given Soy un nuevo usuario de la aplicacion movil de Booking
    When Me encuentro en la pagina principal valido la existencia del titulo "Sign in or create an account" y "Choose any of the options below to sign in or start creating an account."
    And Visualizo los botones "Sign in with email", "Sign in with Google", "Sign in with Facebook" y "Create your account"
    And Presiono el boton "Sign in with email"
    Then Visualizo la vista con titulo "Enter your email address" y "We'll use this to sign you in or to create an account if you don't have one yet."
    And Ingreso correo "roonaldlt@gmail.com"
    And Presiono boton "Continue"
    Then Visualizo la vista con titulo "Enter your password" y "Enter your Booking.com password for roonaldlt@gmail.com."
    And Ingreso una password valida
    And Presiono boton "Sing in"
    Then Debo ver un mensaje de bienvenida en la pantalla de mi cuenta