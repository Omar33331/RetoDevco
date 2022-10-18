#languaje:en

Feature: Make a search of round trip in a web site

  @HostingManual1
  Scenario: Selection where from and where to in the booking site
    Given the User is on the flight options
    When the user enters where from and where to
    And the user enters start and finale date
    Then the user get the available flights