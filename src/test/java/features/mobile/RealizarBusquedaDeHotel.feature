@BSPID0002
Feature: Realizar busqueda de hoteles.

  @TSCID120001
  Scenario: 01 - Buscar hotel con filtros válidos
    Given Soy un nuevo usuario de la aplicacion movil de Booking
    When Me encuentro en la pagina principal valido la existencia del titulo "Sign in or create an account" y "Choose any of the options below to sign in or start creating an account."
    And Visualizo los botones "Sign in with email", "Sign in with Google", "Sign in with Facebook" y "Create your account"
    And Presiono el boton X
    Then Valido la existencia de formulario para realizar
    And Vi
    And Presiono boton "Continue" en la vista Enter your email address
    Then Visualizo la vista con titulo "Enter your password" y "Enter your Booking.com password for desafio.rslt.yape@gmail.com." e ingreso password "yape2023_Desafio"
    And Presiono boton "Sign in" en la vista Enter your password
    Then Debo ver un mensaje de bienvenida en la pantalla de mi cuenta

  @TSCID120002
  Scenario: 02 - Iniciar sesión con credenciales inválidas
    Given Soy un nuevo usuario de la aplicacion movil de Booking
    When Me encuentro en la pagina principal valido la existencia del titulo "Sign in or create an account" y "Choose any of the options below to sign in or start creating an account."
    And Visualizo los botones "Sign in with email", "Sign in with Google", "Sign in with Facebook" y "Create your account"
    And Presiono el boton "Sign in with email"
    Then Visualizo la vista con titulo "Enter your email address" y "We'll use this to sign you in or to create an account if you don't have one yet."
    And Ingreso correo "desafio.rslt.yape@gmail.com"
    And Presiono boton "Continue" en la vista Enter your email address
    Then Visualizo la vista con titulo "Enter your password" y "Enter your Booking.com password for desafio.rslt.yape@gmail.com." e ingreso password "passwordErronea123"
    And Presiono boton "Sign in" en la vista Enter your password
    Then Visualizo mensaje de error "Incorrect password – try again"