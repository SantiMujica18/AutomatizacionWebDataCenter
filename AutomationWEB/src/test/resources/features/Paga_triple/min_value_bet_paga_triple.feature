Feature: Like a user I want use Paga triple service
  Like a user I use paga triple service
  user want to make min bet in paga triple
  So user make the bet


  @MinBetPagaTripleSuccessful
  Scenario: min bet Paga Triple
  #prepositions
    Given user wants to make a paga triple
    #actions
    When user fills the bet in the form with min value
    #consequences
    Then He should sees the text Pago exitoso