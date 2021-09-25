Feature:US_005_Login page should not be accessible with invalid credentials

  Scenario: TC_001_User cannot login with invalid username validating the error message
  When user goes to GmiBank_HomePage
  Then user clicks Sign In dropdown menu
  Then user clicks Sign In link.
  Then user enters an invalid_username to username text box.
  Then user enters a valid_password to password text box.
  Then user clicks Sign In button
  And user sees an error_message.

