Feature: I as user login in Paga todo with empty terms
  As a user login with empty terms
  i want to into Paga todo with empty terms
  So that use their services

  @LoginUserTermsEmpty
  Scenario: Login fail empty terms
    #prepositions
    Given Sebastian login with empty terms
    #actions
    When he tries to log in without terms
    #consequences
    Then He should sees the title Debes aceptar los términos y condiciones