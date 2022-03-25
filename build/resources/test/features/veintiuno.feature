Feature: Casa juega 21

  Scenario: Repartir cartas iniciales
    Given la casa
    When inicia el juego
    Then la casa debe tener dos cartas

  Scenario Outline: obtener total de la mano
    Given una <mano>
    When la casa suma las cartas
    Then la casa debe de tener un <total>

    Examples:
      | mano | total |
      | "9,3"|12 |
      | "8,5"|13 |
      | "A,K"|21 |
      | "10,J"|20 |
      | "Q,K"|20 |
      | "7,J"|17 |
      | "10,A"|21 |

  Scenario Outline: la casa juega con las reglas
    Given una mano con un <total>
    When  la casa juega
    Then  la casa deberia tener la <accion>

    Examples:
      |total|accion|
      |12   |"hit"   |
      |13   |"hit"   |
      |7    |"hit"   |
      |11   |"hit"   |
      |9    |"hit"   |
      |5    |"hit"   |
      |3    |"hit"   |
      |16   |"hit"   |
      |19   |"hit" |
      |20   |"stand" |
      |21   |"stand" |
      |22   |"stand" |
      |18   |"hit" |