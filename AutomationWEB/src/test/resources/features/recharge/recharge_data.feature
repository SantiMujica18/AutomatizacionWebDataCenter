Feature: I as user fill full recharge data
  As a user
  i want do a recharge  operator claro
  So  i should see the title confirmacion de compra

  @fillRechargeDataSuccessful
  Scenario: Fill recharge data
    #prepositions
    Given Sebastian in the recharge data page
    #actions
    When He fills in the form recharge data
    #consequences
    Then He should sees the title confirmacion de compra