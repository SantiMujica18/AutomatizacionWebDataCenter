Feature: I as user  use chance service
  As a user use chance  service
  i want to take a chance
  So that to make the bet

  @MinValueChanceSuccessful
  Scenario: Minimum value chance
    #prepositions
    Given Sebastian wants insert 50 how min value
    #actions
    When He insert the 50 in the form
    #consequences
    Then He should sees the title Total tiquete no permitido minimo $ 700