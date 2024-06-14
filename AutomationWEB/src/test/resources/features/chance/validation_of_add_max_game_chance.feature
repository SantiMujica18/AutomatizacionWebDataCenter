Feature: I as user  use chance service
  As a user use chance  service
  i want to take various bet
  So that to make the bet

  @AddMaxChanceSuccessful
  Scenario: maximum amount of bets
    #prepositions
    Given Sebastian wants to make maximum bets
    #actions
    When He makes the maximum bets
    #consequences
    Then He should sees the class change to button