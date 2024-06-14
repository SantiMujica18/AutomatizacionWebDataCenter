Feature: I as user  use maxi chance service
  As a user use maxi chance  service
  i want to take various bet
  So that to make the bet

  @LotteryEmptyMaxiChanceSuccessful
  Scenario: Field lottery empty game maxi chance
    #prepositions
    Given user wants to make lottery empty bets maxi chance
    #actions
    When He makes the field lottery empty bets maxi chance
    #consequences
    Then He should sees the title Validacion Seleccionar loteria