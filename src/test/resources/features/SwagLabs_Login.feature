@tag
Feature: Swag labs login page
  I want to use this template for my feature file

  Scenario Outline: Verify login to swag labs application with valid credentials
    Given user is in swag labs login page
    And user enters username <username> in swag labs login page
    And user enters password <password> in swag labs login page
    And clicks on login button in swag labs login page
    Then swag labs inventory page will display

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | visual_user             | secret_sauce |
      | performance_glitch_user | secret_sauce |

  Scenario Outline: Verify login to swag labs application with invalid credentials
    Given user is in swag labs login page
    And user enters username <username> in swag labs login page
    And user enters password <password> in swag labs login page
    And clicks on login button in swag labs login page
    Then error message <message> will display in swag labs login page

    Examples: 
      | username        | password     | message                                               |
      | standard_user   |              | "Epic sadface: Password is required"                  |
      | locked_out_user | secret_sauce | "Epic sadface: Sorry, this user has been locked out." |
