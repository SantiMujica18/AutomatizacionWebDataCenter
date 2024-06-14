Feature: Like a user i want to see my cupons
  So I'm in the maing page of paga todo
  I select cupones service
  So i can see all the cupons that i have

  @SelectCuponesSuccessfully
  Scenario: User want to see his cupons
    #prepositions
    Given User wants to see all the cupons
      #actions
    When He clicks cupons services
    #consequences
    Then He shoulds sees the cupons page