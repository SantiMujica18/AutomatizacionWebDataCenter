Feature: Like a user i want to make a recharge

  @ConfirmRechargeSuccessfully
  Scenario: User wants to make a recharge
    #prepositions
  Given User is in saldo virtual page
    #Actions
  When User clicks into recargar saldo and put a value of recharge
    #Consequences
  Then User should sees the text PIN Generado correctamente
