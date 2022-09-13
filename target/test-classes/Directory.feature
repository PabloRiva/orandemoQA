Feature: Directory feature
  Background: User login into Sauce Demo page
    Given Im in orange demo web page

  @employeesAreDisplayed @Logout
  Scenario Outline: Employees are displayed
    Given I set the user name field with "Admin"
    And I set the password field with "admin123"
    When I click on login button
    When I click on Directory link
    Then The employee "<employee>" is displayed
  Examples:
    | employee                  |
    | Odis  Adalwin             |
    | Linda Jane Anderson       |
    | Peter Mac Anderson        |