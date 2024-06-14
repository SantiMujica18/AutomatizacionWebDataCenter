Feature: Like a user i want to recharge my account
  First I login in paga todo
  So I click my balance to make a recharge
  Finally i can see my pin code

@SelectRechargeSuccessfully
  Scenario: Make a recharge of paga todo app
    #Preposition
  Given I'm on the main page of paga todo
    #Actions
    When I click in my balance
    #Consequences
  Then User should sees page of saldo virtual