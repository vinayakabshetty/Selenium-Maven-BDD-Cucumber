@tag
Feature: Swag Labs - Sauce labs demo website
  I want to use this template for my feature file

  @Regression
  Scenario Outline: Login to swag labs
    Given user is in swag labs login page
    When user enters <username> in username field
    And user enters <password> in password field
    And click on login button
    Then swag labs inventory page will display

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
      | error_user    | secret_sauce |

  @Smoke
  Scenario: Logout of swag labs
    Given user is in swag labs inventory page
    When user clicks on hamburger icon button in swag labs inventory page
    And user clicks on Logout button
    Then login page will display
