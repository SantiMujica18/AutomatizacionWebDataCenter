Feature: As a user I want to login to buc with Pedp
  @SuccessfullyloginPedp
  Scenario: Verify the session in buc with your Pedp
    Given that the User is on the main page validating their data with their Pedp
    When you fill out the buc login with its Pedp
    Then the user confirms if he is registered with his Pedp