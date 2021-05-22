
@register
Feature: US_002 System should not allow anyone to register with invalid credentials
  Background:
    Given User goes to GMi Bank Homepage
    And User clicks the "Register" from dropdown menu


  Scenario: TC_001 Any field on the registration page should not be left blank

    And User enter anything to SSN text box and presses the enter key
    Then User should see the SSN error message "enter_ssn_message" message

  Scenario: TC_002 Any field on the registration page should not be left blank
    And User enter anything to Firstname text box and presses the enter key
    Then User should see the Firstname error message "enter_firstname_message" message

  Scenario: TC_002 Any field on the registration page should not be left blank
    And User enter anything to Lastname text box and presses the enter key
    Then User should see the Lastname error message "enter_lastname_message" message

  Scenario: TC_002 Any field on the registration page should not be left blank
    And User enter anything to Adress text box and presses the enter key
    Then User should see the Adress error message "enter_adress_message" message

  Scenario: TC_002 Any field on the registration page should not be left blank
    And User enter anything to Phone Number text box and presses the enter key
    Then User should see the Phone Number error message "enter_phone_number_message" message

  Scenario: TC_002 Any field on the registration page should not be left blank
    And User enter anything to Username text box and presses the enter key
    Then User should see the Username error message "enter_username_message" message

  Scenario: TC_002 Any field on the registration page should not be left blank
    And User enter anything to Email text box and presses the enter key
    Then User should see the Email error message "enter_email_message" message

  Scenario: TC_002 Any field on the registration page should not be left blank
    And User enter anything to New password text box and presses the enter key
    Then User should see the New password error message "enter_new_password_message" message

  Scenario: TC_002 Any field on the registration page should not be left blank
    And User enter anything to New password confirmation text box and presses the enter key
    Then User should see the New password confirmation error message "enter_new_password_confirmation_message" message

