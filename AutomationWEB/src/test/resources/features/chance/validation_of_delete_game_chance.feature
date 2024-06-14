Feature: I as user  use chance service
  As a user use chance  service
  i want to delete to bet
  So that to delete the bet

  @DeleteChanceSuccessful
  Scenario: Delete bet of chance
    #prepositions
    Given Sebastian wants to delete a bet
    #actions
    When He deletes the bet
    #consequences
    Then He should sees the class change to next button