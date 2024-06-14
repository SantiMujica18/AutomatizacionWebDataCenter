Feature: I as user  use super chance service
  As a user use super chance  service
  i want to delete to bet
  So that to delete the bet

  @DeleteSuperChanceSuccessful
  Scenario: Delete bet of super chance
    #prepositions
    Given Sebastian wants to delete a bet super chance
    #actions
    When He deletes the bet super chance
    #consequences
    Then He should sees the class change to next button