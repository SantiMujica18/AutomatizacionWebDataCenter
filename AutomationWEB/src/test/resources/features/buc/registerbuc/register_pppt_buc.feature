Feature: As a user I want to login to buc with pppt

  @Signupsuccessfullypppt
  Scenario: Login to buc with your pppt
    Given user is on the buc registration page
    When you fill out the buc form
    Then the title registration should be successful