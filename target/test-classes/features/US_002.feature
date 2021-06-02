

Feature: US_002 System should not allow anyone to register with invalid credentials
  Background:
    Given User goes to "GmiBank_url" Homepage
    And User clicks the "Register" from dropdown menu


  Scenario: TC_001 Any field on the registration page should not be left blank

    And User enter anything to SSN text box and presses the enter key
    Then User should see the SSN error message "enter_ssn_message" message

  Scenario: TC_002 Any field on the registration page should not be left blank
    And User enter anything to Firstname text box and presses the enter key
    Then User should see the Firstname error message "enter_firstname_message" message

  Scenario: TC_003 Any field on the registration page should not be left blank
    And User enter anything to Lastname text box and presses the enter key
    Then User should see the Lastname error message "enter_lastname_message" message

  Scenario: TC_004 Any field on the registration page should not be left blank
    And User enter anything to Adress text box and presses the enter key
    Then User should see the Adress error message "enter_adress_message" message

  Scenario: TC_005 Any field on the registration page should not be left blank
    And User enter anything to Phone Number text box and presses the enter key
    Then User should see the Phone Number error message "enter_phone_number_message" message

  Scenario: TC_006 Any field on the registration page should not be left blank
    And User enter anything to Username text box and presses the enter key
    Then User should see the Username error message "enter_username_message" message

  Scenario: TC_007 Any field on the registration page should not be left blank
    And User enter anything to Email text box and presses the enter key
    Then User should see the Email error message "enter_email_message" message

  Scenario: TC_008 Any field on the registration page should not be left blank
    And User enter anything to New password text box and presses the enter key
    Then User should see the New password error message "enter_new_password_message" message

  Scenario: TC_009 Any field on the registration page should not be left blank
    And User enter anything to New password confirmation text box and presses the enter key
    Then User should see the New password confirmation error message "enter_new_password_confirmation_message" message

  Scenario Outline: TC_010 SSN number cannot be of any chars nor spec chars except "-"
    And User enter "<invalid_ssn>" to SSN textbox.
    And User preses Tab key.
    Then User sees invalid Ssn message "invalid_ssn_message"
    Examples:
      | invalid_ssn |
      |invalid_ssn1 |
      |invalid_ssn2 |
      |invalid_ssn3 |
      |invalid_ssn4 |
      |invalid_ssn5 |
      |invalid_ssn6 |
      |invalid_ssn7 |
      |invalid_ssn8 |
      |invalid_ssn9 |


    Scenario Outline: TC_011 Mobilephone number cannot be of any chars nor spec chars except "-"
      And User enter "<invalid_phone_nummer>" to Phone number text box.
      And User preses Tab key.
      Then User sees invalid phone number message "invalid_phone_number_message"
      Examples:
        | invalid_phone_nummer |
        |invalid_phone_number1 |
        |invalid_phone_number2 |
        |invalid_phone_number3 |
        |invalid_phone_number4 |
        |invalid_phone_number5 |
        |invalid_phone_number6 |
        |invalid_phone_number7 |
        |invalid_phone_number8 |
        |invalid_phone_number9 |
        |invalid_phone_number10 |
  @register
    Scenario Outline: TC_012 email id cannot be created without "@" sign and "." extensions
      And User enter "<invalid_email>" to email text box
      And User preses Tab key.
      Then User sees invalid email message "invalid_email_message"
      Examples:
        | invalid_email |
        | invalid_email1 |
        | invalid_email2 |








