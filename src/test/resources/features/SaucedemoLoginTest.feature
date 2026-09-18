Feature: login test

  Scenario Outline: Login
    Given Valida el login de usuario
    When Usuario se autentica
    | user   | pass   |
    | <user> | <pass> |
    Then Valida el titulo  Swag Labs
      | tittle   |
      |<tittle>|
    Examples:
      | user          | pass         | tittle      |
      | standard_user | secret_sauce | Products    |

