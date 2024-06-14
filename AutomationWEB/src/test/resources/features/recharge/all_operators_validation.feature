Feature: Like a user i want to validate the operators
  So i want to sign in paga todo
  After that i want to make all the recharges
  user will have validated that

  @ValidateAllOperatorsSuccessfully
  Scenario: Validate all operators
    Given User sign in paga todo
    When user make all recharges of operators
    Then user will have validate all operators