Feature: Google
  I want to search in google search engine and list items

  @Smoke
  Scenario: Search item in google
    Given user is in google search page
    And user enters "J meter" in search field
    When user clicks on search icon