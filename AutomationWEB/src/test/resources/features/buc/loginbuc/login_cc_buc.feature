Feature: As a user I want to login to buc with cc
  @Successfullylogincc
  Scenario: Verify the session in buc with your cc
    Given that the User is on the main page validating their data with their cc
    When you fill out the buc login with its cc
    Then the user confirms if he is registered with his cc