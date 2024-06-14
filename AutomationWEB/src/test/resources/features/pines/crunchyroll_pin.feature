Feature: Purchase a crunchyroll Pin
  Like a user I want to buy a Xbox pin
  So i go to pines service
  i should see the text Pago exitoso

  @SuccesfulPinPurchase
  Scenario: Make a purchase of a crunchyroll pin
    Given I'm on the pines service selector
    When I select crunchyroll pin and fill all the form
    Then He should sees the title Pago exitoso
