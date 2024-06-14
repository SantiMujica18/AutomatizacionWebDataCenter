Feature: Adjust the account balance of the entered user
  as user
  I want to be able to adjust the account balance of the entered user
  To access make the balance adjustment

  @SuccessfulBalanceAdjustment
  Scenario: Adjust the account balance of the logged in user
  Given Sebastian on the settings page
    When he enters the document number
    And he cleans the document
    And he enters selects the type of adjustment
    And he enters value adjustment
    And he enters the setting value
    And he clicks the process button
    Then he should see the title Change Successfully Done