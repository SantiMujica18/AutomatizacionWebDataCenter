Feature: I as user  use service pagatriple
  As a user use  service pagatriple
  double the lottery in betting
  So that to confirm the bet

  @repeatedLotterySelectionpagaTriple
  Scenario: double the lottery in betting
    #prepositions
    Given the user wants to double the lottery in bets
    #actions
    When notice red duplicate lottery alert message
    #consequences
    Then  confirm a duplicate lottery message
