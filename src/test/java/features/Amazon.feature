Feature: Amazon
  testing amazon website

  @Smoke
  Scenario: Navigate to amazon
    Given user is in google search page
    And user navigates to "https://www.amazon.in" page
    Then amazon home page is displayed from newBranch.
