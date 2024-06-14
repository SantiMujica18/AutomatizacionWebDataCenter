Feature: make product pin payment
  as user
  I want to be able to pay for a pin
  To access make the pin payment

  @SuccessfulPinPayment
  Scenario: Make product pin payment
    Given Sebastian on the product page
    When he selects the xbox product
    And he select the pin
    And he select the personal data check
    And he click on the next button
    And he click on the payment method
    And he click on the pay button
    Then he should then see the title Exito