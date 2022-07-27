Feature: Google Search

  @GoogleSearch
  Scenario: Google Search Keyword
    Given Tai is searching things on the internet
    When he input to search field "Demo with Selenium"
    Then he should see information about "Demo with Selenium"