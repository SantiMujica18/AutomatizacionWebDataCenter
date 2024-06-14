Feature: I as user use paga triple service
  As a user use paga triple  service
  i want to make a incomplete bet
  So i see an error message

  @MissingLoteryPagaTripleValidation
  Scenario: Data incomplete Bet in Paga triple
    #preposition
    Given user wants to validate a incomplete bet
    #actions
    When user fill the bet form with a missing lottery
    #consequences
    Then He can't make the bet