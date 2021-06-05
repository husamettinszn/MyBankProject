Feature:US_003 Registration page should restrict password usage to a secure
  and high level passcode

  Background:
    When User goes to "GmiBank_url" Homepage
    And User clicks the "Register" from dropdown menu
  @register
  Scenario: TC_001 There should be at least one lowercase char for stronger password and
  see the level chart change accordingly
    And User scrolls down the page
    And User enter to password text box five lowercase "invalid_password1" and presses tab
    Then User sees invalid password message "password_should_contain_at_least" und
    Then User sees on the password strenght bar red colour
