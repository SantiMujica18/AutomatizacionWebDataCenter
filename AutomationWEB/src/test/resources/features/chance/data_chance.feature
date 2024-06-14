Feature: I as user  use chance service
  As a user use chance  service
  i want to take a chance
  So that to make the bet

  @DataChanceSuccessful
  Scenario: Send chance
    #prepositions
    Given Sebastian wants to take a chance
    #actions
    When He insert the data in the form
    #consequences
    Then He should sees the title Confirmación de compra