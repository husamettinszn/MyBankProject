@login
Feature:Login page should accessible with valid credentials

  Background:
    When user goes home page "GMIBank_Url"
    And user clicks Sign in dropdown menu
    And user clicks Sign in link
    And user enter a "valid_username" to username textbox
    And user enters a "valid_password" to password textbox

  Scenario:TC_001_There should be a valid username and password validating the success message to login

    And user clicks Sign In button
    Then user sees My Operations link

  Scenario: TC_002_There should be an option to cancel login

    And user clicks Cancel button
    Then user sees  Sign In dropdown link
