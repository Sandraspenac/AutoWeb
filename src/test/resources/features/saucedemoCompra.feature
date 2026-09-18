

Feature: Compra de productos

  Scenario Outline: Compra exitosa

    Given Usuario ingresa a la página de Saucedemo

    When el cliente realiza la compra con nombre "<nombre>", apellido "<apellido>" y código postal "<codigo>"

    Then la compra debe finalizar correctamente

    Examples:

      | nombre | apellido | codigo |
      | Sandra | Peña | 110111 |