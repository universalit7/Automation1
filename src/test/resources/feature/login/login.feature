Feature: Login Functionality Test

  Scenario: check login credentials valid
    Given user is on login page
    When user enters user name and password
    And clicks on login button
    Then User is navigated to the home page

    @Smoke
    Scenario: check login with invalid credentials
      Given user is on login page
      When user enters user name and password
      And clicks on login button
      Then error message is displayed - invalid Credentials