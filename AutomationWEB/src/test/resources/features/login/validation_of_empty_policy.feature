Feature: I as user login in Paga todo with empty policy
  As a user login with empty policy
  i want to into Paga todo with empty policy
  So that use their services

  @LoginUserPolicyEmpty
  Scenario: Login fail empty policy
    #prepositions
    Given Sebastian login with empty policy
    #actions
    When he tries to log in without policy
    #consequences
    Then He should sees the title Debes aceptar la politica de tratamiento de datos Personales