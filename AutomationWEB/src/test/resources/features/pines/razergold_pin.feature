Feature: Purchase a Xbox Pin
  Like a user I want to buy a Razer gold pin
  So i go to pines service
  i should see the text Pago exitoso

  @SuccesfulPinPurchase
  Scenario: Make a purchase of a Razer gold pin
    Given I'm on the pines service selector
    When I select Razer gold pin and fill all the form
    Then He should sees the title Pago exitoso
