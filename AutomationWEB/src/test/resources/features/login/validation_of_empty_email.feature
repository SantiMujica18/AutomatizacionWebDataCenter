Feature: I as user login in Paga todo with empty email
  As a user login with empty email
  i want to into Paga todo with empty email
  So that use their services

  @LoginUserEmailEmpty
  Scenario: Login fail empty email in Paga Todo
    #prepositions
    Given Sebastian login with empty email
    #actions
    When he tries to log in without email
    #consequences
    Then He should sees the title El valor del campo es obligatorio