Feature: advantage

  @ingresarAAdvantage
  Scenario: ingresar a advantage
    Given se abre el advantage
    When Se presiona el icono User
    When Se ingresan las credenciales
    Then Se presiona el button login

    @comprarProducto
    Scenario: comprar producto en advantage
      When Se debe seleccionar categoria
      And Se debe seleccionar un producto y agregarlo
      And Se presiona boton para agregar
      And Se presiona button de carrito
      And Se confirma el pago

      @contactar
      Scenario: se llena formulario para contactar
        When Se retorna a la pagina de inicio
        And Se llena formulario Contacto
        And Se selecciona boton enviar

        @CerrarSesion
        Scenario: Se cierra la sesion
          When Seleccionar icono cerrar Sesion
          And Cerrar Sesion
          And Cerrar el navegador







