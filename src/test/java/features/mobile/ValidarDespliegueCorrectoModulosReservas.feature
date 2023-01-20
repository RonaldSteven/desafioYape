@BSPID0003
Feature: Validar el despliegue correcto de las vista para cada menu de la app.

  Background:
    Given Soy un nuevo usuario de la aplicacion movil de Booking
    When Me encuentro en la pagina principal valido la existencia del titulo "Sign in or create an account" y "Choose any of the options below to sign in or start creating an account."
    And Visualizo los botones "Sign in with email", "Sign in with Google", "Sign in with Facebook" y "Create your account"
    And Presiono el boton X

  @TSCID130001
  Scenario: 01 - Validar despliegue formulario de la vista Stays.
    Then Debo visualizar que menu "Stays" se encuentre seleccionado
    And Debo visualizar formulario "Stays"
    And Visualizo boton "Search" para buscar hoteles

  @TSCID130002
  Scenario: 02 - Validar despliegue formulario de la vista Flights.
    And Selecciono del menu superior la opcion "Flights"
    Then Debo visualizar formulario "Flights"
    And Visualizo boton "Search" para buscar vuelos

  @TSCID130003
  Scenario: 03 - Validar despliegue formulario de la vista Car rental.
    And Selecciono del menu superior la opcion "Car rental"
    Then Debo visualizar formulario "Car rental"
    And Visualizo boton "Search" para alquilar auto

  @TSCID130004
  Scenario: 04 - Validar despliegue modal bienvenida a menu Taxis.
    And Selecciono del menu superior la opcion "Taxi"
    Then Debo visualizar modal con titulo "Taxi"
    And Visualizo titulo "Trusted taxis around the world" y descripcion "Airport transfers or city trips – travel with experienced local drivers from our global network of taxi partners" de bienvenida
    And Visualizo boton "Skip"

  @TSCID130005
  Scenario: 05 - Validar despliegue formulario de la vista Taxis.
    And Selecciono del menu superior la opcion "Taxi"
    And Debo visualizar modal con titulo "Taxi"
    And Presiono boton "Skip"
    Then Debo visualizar formulario "Taxi"
    And Visualizo boton "See prices" para buscar taxis

  @TSCID130006
  Scenario: 06 - Validar despliegue formulario de la vista Attractions.
    And Selecciono del menu superior la opcion "Attractions"
    Then Debo visualizar formulario "Attractions"
    And Visualizo boton "Search" para buscar atracciones