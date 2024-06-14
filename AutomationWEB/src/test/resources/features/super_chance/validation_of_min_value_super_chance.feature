Feature: I as user  use super chance service
  As a user use super chance  service
  i want to take a super chance
  So that to make the bet

  @MinValueSuperChanceSuccessful
  Scenario: Minimum value super chance
    #prepositions
    Given Sebastian wants insert min value
    #actions
    When He insert the min value in the form
    #consequences
    Then He should sees the title Total tiquete no permitido