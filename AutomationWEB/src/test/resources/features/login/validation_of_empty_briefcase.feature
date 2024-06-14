Feature: I as user login in Paga todo with empty briefcase
  As a user login with empty briefcase
  i want to into Paga todo with empty briefcase
  So that use their services

  @LoginUserBriefCaseEmpty
  Scenario: Login fail empty briefcase
    #prepositions
    Given Sebastian login with empty briefcase
    #actions
    When he tries to log in without briefcase
    #consequences
    Then He should sees the title Debes aceptar el portafolio actual habilitado