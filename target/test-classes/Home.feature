Feature: Search feature
  Background: User login into Sauce Demo page
    Given Im in orange demo web page

  @searchEmployee @Logout
  Scenario: Search
    Given I set the user name field with "Admin"
    And I set the password field with "admin123"
    And I click on login button
    And I fill the search information with
      | 0038 | Odis Adalwin | Aaliyah |
    And I click on search button
    Then The employee should be displayed

  @searchMenu
  Scenario: Search Menu
    Given I set the user name field with "Admin"
    And I set the password field with "admin123"
    And I click on login button
    When I click on search text box
    And I fill the search input with "Directory"
    Then The menu should show jus Directory

  @linkLogo
  Scenario: Click on logo
    Given I set the user name field with "Admin"
    And I set the password field with "admin123"
    And I click on login button
    When I click on link logo
    Then we should be in about page


