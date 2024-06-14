Feature: I as user use paga triple service
  As a user use paga triple  service
  i want to make a bet with no lotteries available
  So I can't make the bet

  @ValidationNoLotteriesAvailableSuccessful
  Scenario: Try to do a paga triple bet
    #preposition
  Given User wants to make a paga triple bet
    #actions
  When He try to select a lottery
    #consequences
  Then He can't make the bet