Feature: I as user login in Paga todo with empty fields
  As a user login with empty fields
  i want to into Paga todo with empty fields
  So that use their services

  @LoginUserEmptyFiels
  Scenario: Login fail empty fields in Paga Todo
    #prepositions
    Given Sebastian login with empty fields
    #actions
    When He doesn't fill in the form login
    #consequences
    Then He should sees the text El valor del campo es obligatorio