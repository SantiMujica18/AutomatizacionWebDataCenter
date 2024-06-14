Feature: Like a user i want to buy a Kalley recharge
  As a user I'm on the recharge page
  I want to recharge my phone and buy the recharge
  So I Confirm the recharge

  @ConfirmKalleyRechargeSuccessful
  Scenario: Confirm a Kalley recharge

    Given User wants to make a Kalley recharge
     #prepositions
    When User makes the recharge and he pays
    #actions
    Then He should sees the title Pago exitoso
    #consequences