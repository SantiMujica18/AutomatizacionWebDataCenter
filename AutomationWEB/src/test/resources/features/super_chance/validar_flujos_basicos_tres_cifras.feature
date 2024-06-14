#language=es
Feature: Validar todos los flujos basicos para el producto super chance para tres cifras

  @CP01
  Scenario Outline: Validar la compra aleatoria con tres cifras con un valor minimo de apuesta
    Given el usuario se logea en la aplicacion de paga todo con su usuario "<usuario>" y su contraseña "<password>"
    When el usuario selecciona el producto de super chance
    And el usuario selecciona una loteria
    And el usuario selecciona un numero aleatorio de tres cifras
    And el usuario selecciona el valor minimo de apuesta
    And el usuario valida el metodo de pago y confirma la apuesta
    Then el usuario debera ver el titulo de pago exitoso
    Examples:
      | usuario                     | password |
      | juan.benavides@dcsas.com.co | Pruebas1 |

  @CP02
  Scenario Outline: Validar la compra aleatoria con tres cifras con un valor maximo de apuesta
    Given el usuario se logea en la aplicacion de paga todo con su usuario "<usuario>" y su contraseña "<password>"
    When el usuario selecciona el producto de super chance
    And el usuario selecciona una loteria
    And el usuario selecciona un numero aleatorio de tres cifras
    And el usuario selecciona el valor minimo de apuesta
    And el usuario valida el metodo de pago y confirma la apuesta
    Then el usuario debera ver el titulo de pago exitoso
    Examples:
      | usuario                     | password |
      | juan.benavides@dcsas.com.co | Pruebas1 |

  @CP03
  Scenario Outline: Validar la cantidad de lineas maximas de apuesta con lineas aleatorias de tres cifras
    Given el usuario se logea en la aplicacion de paga todo con su usuario "<usuario>" y su contraseña "<password>"
    When el usuario selecciona el producto de super chance
    And el usuario selecciona una loteria
    And el usuario selecciona un numero aleatorio de tres cifras
    And el usuario selecciona el valor minimo de apuesta
    And el usuario agrega el maximo de lineas permitido
    And el usuario valida el metodo de pago y confirma la apuesta
    Then el usuario debera ver el titulo de pago exitoso
    Examples:
      | usuario                     | password |
      | juan.benavides@dcsas.com.co | Pruebas1 |


  @CP04
  Scenario Outline: Validar la compra manual con tres cifras con un valor minimo de apuesta
    Given el usuario se logea en la aplicacion de paga todo con su usuario "<usuario>" y su contraseña "<password>"
    When el usuario selecciona el producto de super chance
    And el usuario selecciona una loteria
    And el usuario selecciona un numero aleatorio de tres cifras
    And el usuario selecciona el valor minimo de apuesta
    And el usuario valida el metodo de pago y confirma la apuesta
    Then el usuario debera ver el titulo de pago exitoso
    Examples:
      | usuario                     | password |
      | juan.benavides@dcsas.com.co | Pruebas1 |

  @CP05
  Scenario Outline: Validar la compra manual con tres cifras con un valor maximo de apuesta
    Given el usuario se logea en la aplicacion de paga todo con su usuario "<usuario>" y su contraseña "<password>"
    When el usuario selecciona el producto de super chance
    And el usuario selecciona una loteria
    And el usuario selecciona un numero manual "<numero_uno>" de tres cifras
    And el usuario selecciona el valor minimo de apuesta
    And el usuario valida el metodo de pago y confirma la apuesta
    Then el usuario debera ver el titulo de pago exitoso
    Examples:
      | usuario                     | password |
      | juan.benavides@dcsas.com.co | Pruebas1 |







