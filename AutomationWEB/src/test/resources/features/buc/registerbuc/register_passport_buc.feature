Feature: As a user I want to login to buc with passport

  @Signupsuccessfullypassport
  Scenario: Login to buc with your passport
    Given user is on the buc registration in Landingpage
    When you fill out the buc form with your data pasport
    Then the user is registered with his Passport