Feature: El usuario podra validar el flujo de compra de manera manual para una cifra (chance tradicional)

  @CP01
  Scenario Outline: El usuario realizara una compra de una cifra
    Given El usuario se logea en paga todo app con su usuario "<username>" y su contrasena "<password>"
    When El usuario selecciona el juego de chance tradicional
    When el usuario selecciona una loteria
    And el usuario digita el numero de apuesta "<numero apuesta>"
    And el usuario ingresa el valor de la apuesta directa "<valor apuesta>"
    And el usuario valida el resumen de la apuesta
    And el usuario paga la apuesta
    Then El usuario debera ver el titulo Pago exitoso
    Examples:
      | username                    | password | numero apuesta | valor apuesta |
      | juan.benavides@dcsas.com.co | Pruebas1 | 290           | 2000          |