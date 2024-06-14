Feature: Send Token to Reset Password

  As a user I forgot my password
  I want to receive a token in my email
  So I can reset my password
  @SendTokenSuccessful
  Scenario: Receive Token to Reset Password
    #prepositions
    Given I am on the login page
    #actions
    When I select the Olvide clave
    And I provide my user "<usuario>"
    #consequences
    Then Then I should receive a token in my email