Feature: I as user  use paga triple service
  As a user use paga triple service
  i want to confirm a paga triple
  So that to confirm the bet

  @ConfirmPagaTripleSuccessful
  Scenario: Confirm paga triple Sucessful
    #prepositions
    Given user wants to confirm a paga triple
    #actions
    When He confirm the paga triple
    #consequences
    Then He should sees the title Pago exitoso


    @ConfirmPagaTripleUnsuccessful
    Scenario: Confirm paga triple unsucessful
    #prepositions
      Given user wants to confirm a paga triple
    #actions
      When He confirm the paga triple
      #consequences
      Then He should sees the title Insufficient funds