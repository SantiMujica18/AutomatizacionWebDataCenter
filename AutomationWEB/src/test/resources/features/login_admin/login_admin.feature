Feature: Login
  as user
  I want to be able to log into my account
  To access protected functionalities

  @LoginAdminSuccessful
  Scenario: Login successfully
    Given that I'm on the login page
    When I enter my username and password
    And I click on the ingresar button
    Then you should see the home page Bienvenido
