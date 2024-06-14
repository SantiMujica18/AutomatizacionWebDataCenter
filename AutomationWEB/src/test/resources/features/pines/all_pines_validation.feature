Feature: Like a user i want to validate all pins
  So i sign in paga todo
  I select every pin and make a purchase
  So i should see a report with all the pins

@ValidateAllPinsSuccessfully
  Scenario: Validate the operation of all pins
    Given user is in paga todo page
    When user make a purchase of every pin
    Then he should see a report with the status