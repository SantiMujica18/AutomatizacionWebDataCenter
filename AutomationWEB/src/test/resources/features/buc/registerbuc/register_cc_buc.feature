Feature: As a user I want to login to buc with cc

  @Signupsuccessfullycc
  Scenario: Login to buc with your cc
    Given user is on the buc registration in the Landing page
    When you fill out the buc form with your data
    Then the user is registered with his CC