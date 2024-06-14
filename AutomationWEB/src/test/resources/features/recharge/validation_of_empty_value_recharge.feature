Feature: I as user login in Paga todo with value recharge
  As a user service recharge with empty value recharge
  i want to into Paga todo with empty value recharge
  So that use their service recharge

  @ValueRechargeEmpty
  Scenario: Recharge fail empty value recharge
    #prepositions
    Given Sebastian reloads with empty reload value
    #actions
    When He tries to reload without value
    #consequences
    Then He should sees the title El valor del campo es obligatorio.