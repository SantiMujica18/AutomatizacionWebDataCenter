Feature: Select Administration
  as user
  I want to be able to select the administration section
  To access the delete balance section

  @SelectAdministration
  Scenario: Select administration section
    Given Sebastian on the home page
    When He clicks on administration
    And He clicks on the settings section
    And He clicks on the delete balances section
    Then He should then see the balance clear page