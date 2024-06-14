Feature: I as user  use chance service
  As a user use chance  service
  i want to take a chance
  So that to make the bet

  @BetSameNumberChanceSuccessful
  Scenario: Bet same number chance
    #prepositions
    Given Sebastian wants to take a chance same number
    #actions
    When He insert the data in the form same number
    #consequences
    Then He should sees the title Ya tienes un juego con este mismo número.