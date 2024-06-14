Feature: I as user  use maxi chance service
  As a user use maxi chance  service
  i want to delete to bet
  So that to delete the bet

  @DeleteMaxiChanceSuccessful
  Scenario: Delete bet of maxi chance
    #prepositions
    Given Sebastian wants to delete a bet maxi chance
    #actions
    When He deletes the bet maxi chance
    #consequences
    Then He should sees the class change to next button