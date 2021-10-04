Feature:US_003 Registration page should restrict password usage to a secure
  and high level passcode

  Background:
    When User goes to "GmiBank_url" Homepage
    And User clicks the "Register" from dropdown menu
  @register
  Scenario: TC_001 There should be at least one lowercase char for stronger password and
  see the level chart change accordingly
    And User scrolls down the page
    And User enters to password text a password "invalid_password1" that contains six character, at leats an uppercase a digit aspecial character
    And user sees not last green bar
    And user enters a lowercase "lowerCase" character
    Then user sees last green bar
