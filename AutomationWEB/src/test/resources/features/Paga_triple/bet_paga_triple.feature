Feature: I as user use paga triple service
  As a user use paga triple  service
  i want to confirm a paga triple
  So that to confirm the bet

  @BetPagaTripleSuccessful
  Scenario: Send paga triple
    #prepositions
    Given user wants make three number of two figure on paga triple
    #actions
    When He makes three number of two figure on paga triple
    #consequences
    Then He should sees the title Confirmación de compra


  @BetPagaTripleUnSuccessful
  Scenario: Send paga triple
    #prepositions
    Given user wants make three number of two figure on paga triple
    #actions
    When He makes three number of two figure on paga triple
    #consequences
    Then He should sees the sentence Lotería o sorteo repetido.
