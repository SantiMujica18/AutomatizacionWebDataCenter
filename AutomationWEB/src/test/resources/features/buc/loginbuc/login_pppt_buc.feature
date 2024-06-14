Feature: As a user I want to login to buc with pppt
  @Successfullyloginpppt
  Scenario: Verify the session in buc with your pppt
    Given that the User is on the main page validating their data with their pppt
    When you fill out the buc login with its pppt
    Then the user confirms if he is registered with his pppt