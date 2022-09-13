Feature: Login feature
  Background: User login into orange demo page
    Given Im in orange demo web page

  @loginWithValidCredentials @Logout
  Scenario: Login with valid credentials
    Given I set the user name field with "Admin"
    And I set the password field with "admin123"
    When I click on login button
    Then The home page should be displayed

  @loginInvalidCredentials
  Scenario: Login with invalid credentials
    Given I set the user name field with "wrong_user"
    And I set the password field with "wrong password"
    When I click on login button
    Then An error message that says "Invalid credentials" is displayed
