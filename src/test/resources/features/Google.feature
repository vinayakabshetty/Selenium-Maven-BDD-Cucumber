Feature: Google
  I want to search in google search engine and list items

  @New
  Scenario: Search item in google
    Given user is in google search page
    And user enters "J meter" in search field
    When user clicks on search icon

  @Smoke
  Scenario: Navigate to gmail login page
    Given user is in google search page
    And user clicks on gmail link
    Then gmail sign on page will display
