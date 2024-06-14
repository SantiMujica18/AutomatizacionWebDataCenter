Feature: As a user I want to login to buc with PEDPPEFDLF
  @SuccessfullyloginPEDPPEFDLF
  Scenario: Verify the session in buc with your PEDPPEFDLF
    Given that the User is on the main page validating their data with their PEDPPEFDLF
    When you fill out the buc login with its PEDPPEFDLF
    Then the user confirms if he is registered with his PEDPPEFDLF