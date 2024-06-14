Feature: El usuario podra validar el flujo de compra de manera aleatoria para una cifra

@CP01
Scenario Outline: El usuario realizara una compra aleatoria de una cifra
Given el usuario se logea en paga todo app con su usuario "<username>" y su contrasena "<password>"
When el usuario selecciona el juego de chance tradicional
When el usuario selecciona una loteria
When el usuario selecciona el numero aleatorio tres cifras
And el usuario ingresa el valor de la apuesta directa "<valor apuesta>"
And el usuario valida el resumen de la apuesta
And el usuario paga la apuesta
Then El usuario debera ver el titulo Pago exitoso
Examples:
| username                    | password | valor apuesta |
| david.mujica@dcsas.com.co   | Mujica321|  2000         |