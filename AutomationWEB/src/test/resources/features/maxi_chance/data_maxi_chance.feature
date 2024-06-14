Feature: I as user  use maxichance service
  As a user use maxichance  service
  i want to take a maxichance
  So that to make the bet

  @DataMaxiChanceSuccessful
  Scenario: Send maxichance
    #prepositions
    Given users wants to take a maxichance
    #actions
    When He insert the data in the form
    #consequences
    Then He should sees the title Confirmación de compra