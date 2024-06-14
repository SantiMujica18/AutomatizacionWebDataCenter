Feature: Like a user I want use Paga triple service
  Like a user I use paga triple service
  user want to make max bet in paga triple
  So user make the bet


  @MaxBetPagaTripleSuccessful
  Scenario: Max bet Paga Triple
  #prepositions
  Given user wants to make a paga triple
    #actions
  When user insert the bet in the form with max value
    #consequences
  Then He should sees the text Pago exitoso
