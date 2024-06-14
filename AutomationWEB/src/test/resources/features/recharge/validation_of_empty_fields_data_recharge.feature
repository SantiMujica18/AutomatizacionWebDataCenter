Feature: I as user login in Paga todo with empty cell phone number
  As a user login with empty cell phone number
  i want to into Paga todo with empty cell phone number
  So that use their service recharge

  @DataRechargeCellPhoneEmpty
  Scenario: Login fail empty cell phone number
    #prepositions
    Given Sebastian login with empty cell phone number
    #actions
    When he tries to log in without cell phone number
    #consequences
    Then He should sees the title El campo debe contener un número de 10 digitos.