Feature: I as user  use recharge service
  As a user use recharge service
  i want to select recharge service
  So that use select recharge

  @SendRechargeSuccessful
  Scenario: Send recharge
    #prepositions
    Given Sebastian in the recharge page
    #actions
    When He select recharge service
    #consequences
    Then He should sees the title REALIZAR RECARGA