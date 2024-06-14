Feature: As a user I want to login to buc with ce
  @Successfullylogince
  Scenario: Verify the session in buc with your ce
    Given that the User is on the main page validating their data with their ce
    When you fill out the buc login with its ce
    Then the user confirms if he is registered with his ce