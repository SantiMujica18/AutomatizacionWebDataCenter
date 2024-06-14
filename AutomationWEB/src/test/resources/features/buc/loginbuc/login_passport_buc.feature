Feature: As a user I want to login to buc with Passport
  @SuccessfullyloginPassport
  Scenario: Verify the session in buc with your Passport
    Given that the User is on the main page validating their data with their Passport
    When you fill out the buc login with its Passport
    Then the user confirms if he is registered with his Passport