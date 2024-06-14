Feature: Like a user i want to recharge my beplay account
  So I sign in paga todo
  after that I select betplay service
  and confirm a recharge


  @ConfirmRechargeSuccessfully
  Scenario: Make a recharge of betplay
    #Preconditions
    Given User is in the main page of paga todo
    #Actions
    When User select betplay and fills the form
    #Consequences
    Then User should sees the text Recarga exitosa

