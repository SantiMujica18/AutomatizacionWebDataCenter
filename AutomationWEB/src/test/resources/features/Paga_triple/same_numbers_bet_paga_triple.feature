Feature: Like a user want to use Paga triple service
  Like a user I use Paga triple service
  User want to make the same number for all the bet
  So user make the bet

  @SameNumberBetPagaTripleSuccessful
  Scenario: Same number paga triple
    #prepositions
  Given user wants to make a paga triple bet
    #actions
  When user fills the same number in the bet
    #consequences
  Then He should sees the title Pago exitoso