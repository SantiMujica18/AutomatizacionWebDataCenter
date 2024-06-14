Feature: I as user  use chance service
  As a user use chance  service
  i want to take a chance
  So that to make the bet

  @MaxValueChanceSuccessful
  Scenario: Maximum value chance
    #prepositions
    Given Sebastian wants insert 1000000 how min value
    #actions
    When He insert the 1000000 in the form
    #consequences
    Then He should sees the title Total tiquete no permitido máximo $ 100000