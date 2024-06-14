Feature: I as user  use paga triple service
  As a user use paga triple service
  i want to send again the voucher
  So I send the voucher


  Scenario: Send voucher Paga triple
    #prepositions
  Given user wants to resend the voucher of paga triple
    #actions
  When user click in Enviar soporte al correo
    #consequences
  Then He should sees the title Soporte enviado