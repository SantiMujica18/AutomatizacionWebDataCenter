Feature: Like a user i want to buy a Flash recharge
  As a user I'm on the recharge page
  I want to recharge my phone and buy the recharge
  So I Confirm the recharge

  @ConfirmFlashRechargeSuccessful
  Scenario: Confirm a Flash recharge
     #prepositions
    Given User wants to make a Flash recharge
    #actions
    When User makes the recharge and he pays
    #consequences
    Then He should sees the title Pago exitoso