Feature:US_005_Login page should not be accessible with invalid credentials

  Background:
    When user goes to "GmiBank_HomePage"
    Then user clicks Sign In dropdown menu
    Then user clicks Sign In link.


  Scenario: TC_001_User cannot login with invalid username validating the error message

    Then user enters an "invalid_username" to username text box.
    Then user enters a "valid_passwordd" to password text box.
    Then user clicks Sign In button
    And user sees an "error_message".

  Scenario: TC_002_User cannot login with invalid password validating the error message
    Then user enter a "valid_username1" to username textbox.
    Then user enters an "invalid_password" to passwor text box.
    Then user clicks Sign In button
    And user sees an "error_message".


  Scenario: TC_003_User cannot login with invalid username and password validating the error message
    Then user enters an "invalid_username" to username text box.
    Then user enters a "invalid_password" to password text box.
    Then user clicks Sign In button
    And user sees an "error_message".


  Scenario: TC_004_User with invalid credentials should be given an option to reset their password
    Then user enters an "invalid_username" to username text box.
    Then user enters a "invalid_password" to password text box.
    Then user clicks Sign In button
    Then user sees a "passwordReset_message".
    Then user clicks passwordReset_link.
    And user sees Password Reset button is clickable.

  @invalid
  Scenario: TC_004_User with invalid credentials should be given an option to reset their password
    Then user enters an "invalid_username" to username text box.
    Then user enters a "invalid_password" to password text box.
    Then user clicks Sign In button
    Then clicks sees New Account Register link
    And user goes Registration Page "registiration_page"