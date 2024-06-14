Feature: Purchase a Xbox Pin
  Like a user I want to buy a Xbox live pin
  So i go to pines service
  i should see the text Pago exitoso

  @SuccesfulPinPurchase
  Scenario: Make a purchase of a Xbox live pin
    Given I'm on the pines service selector
    When I select Xbox live pin and fill all the form
    Then He should sees the title Pago exitoso
