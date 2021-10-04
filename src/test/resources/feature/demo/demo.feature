Feature: Demo Functionality Test

  Scenario: check login with valid credentials
    Given user calculated 1+2
    When user enters user name and password
    And clicks on login button
    Then User is navigated to the home page

  @Smoke
  Scenario: check Demo with invalid credentials
    Given user is on login page
    When user enters user name and password
    And clicks on login button
    Then error message is displayed - invalid Credentials