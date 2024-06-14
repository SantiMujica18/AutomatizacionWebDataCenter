Feature: As a user I want to login to buc

  @RegisterSuccessfully
  Scenario: Login to buc
    Given User is in register page of buc
    When He fills the form of buc
    Then He should sees the tittle registro exitoso