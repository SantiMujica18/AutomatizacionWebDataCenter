Feature: I as user confirm select payment method
  As a user confirm recharge select payment method
  i want to into confirm recharde select payment method
  So that use their service recharge

  @SelectEmptyPaymentRecharge
  Scenario: Recharge fail select payment method
    #prepositions
    Given Sebastian reloads select payment method
    #actions
    When He tries to reload select payment method
    #consequences
    Then He should sees the title Selecciona un método de pago.