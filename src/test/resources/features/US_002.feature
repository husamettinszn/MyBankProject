Feature: US_002 System should not allow anyone to register with invalid credentials
@register
  Scenario: TC_001 Any field on the registration page should not be left blank

    Given User goes to GMi Bank Homepage
    And User clicks the "Register" from dropdown menu
    And User enter anything to SSN text box and presses the enter key
    Then User should see "ssnMessage" message
