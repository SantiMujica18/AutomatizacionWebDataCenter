Feature: I as user login in Paga todo with empty password
  As a user login with empty password
  i want to into Paga todo with empty password
  So that use their services

  @LoginUserPasswordEmpty
  Scenario: Login fail empty password
    #prepositions
    Given Sebastian login with empty password
    #actions
    When he tries to log in without password
    #consequences
    Then He should sees the massage El valor del campo es obligatorio