Feature: I as user use paga triple service
  As a user use paga triple  service
  i want to make a incomplete bet
  So i see an error message


  @DataIncompletePagaTripleBet
  Scenario: Data incomplete Bet in Paga triple
    #preposition
  Given user wants to validate a incomplete bet
    #actions
  When user fill the bet with a missing number
    #consequences
  Then He should sees the text Falta un digito