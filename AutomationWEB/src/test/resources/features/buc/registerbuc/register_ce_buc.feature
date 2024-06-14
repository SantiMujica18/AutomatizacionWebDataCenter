Feature: As a user I want to login to buc with ce

  @Signupsuccessfullyce
  Scenario: Login to buc with your ce
    Given user is on the buc registration Landingpage
    When you fill out the buc form with your data CE
    Then the user is registered with his CE