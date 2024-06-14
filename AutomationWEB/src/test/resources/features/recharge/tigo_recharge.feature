Feature: Like a user i want to buy a Tigo recharge
  As a user I'm on the recharge page
  I want to recharge my phone and buy the recharge
  So I Confirm the recharge

  @ConfirmTigoRechargeSuccessful
  Scenario: Confirm a Tigo recharge
     #prepositions
    Given User wants to make a Tigo recharge
    #actions
    When User makes the recharge and he pays
    #consequences
    Then He should sees the title Pago exitoso