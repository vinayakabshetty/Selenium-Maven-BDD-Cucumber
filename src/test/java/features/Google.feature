Feature: Google
  I want to search in google search engine and list items

  @Smoke
  Scenario: Search item in google
    Given user is in google search page
    And user enters "J meter" in search field
    When user clicks on search icon
    
  Scenario: Navigate to gmail login page
    Given user is in google search page
    And user clicks on gmail link
    Then gmail inbox page will display