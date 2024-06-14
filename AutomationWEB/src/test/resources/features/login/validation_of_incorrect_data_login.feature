Feature: I as user login in Paga todo with incorrect data
  As a user login with incorrect data
  i want to into Paga todo with incorrect data
  So that use their services

  @LoginUserIncorrectData
  Scenario: Login fail incorrect data
    #prepositions
    Given Sebastian login with incorrect data
    #actions
    When He fills with incorrect data in the form login
    #consequences
    Then He should sees the text La cuenta o contraseña ingresada es incorrecta