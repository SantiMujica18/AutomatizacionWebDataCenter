Feature: Like a user i want to buy a etb recharge
  As a user I'm on the recharge page
  I want to recharge my phone and buy the recharge
  So I Confirm the recharge

  @ConfirmEtbRechargeSuccessful
  Scenario: Confirm a etb recharge
    #prepositions
    Given User wants to make a etb recharge
   #actions
    When User makes the recharge and he pays
    #consequences
    Then He should sees the title Pago exitoso