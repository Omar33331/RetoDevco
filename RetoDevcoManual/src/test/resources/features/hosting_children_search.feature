#languaje:en

Feature: Make a search of hosting with children in booking page

  @HostingManual1
  Scenario: Carrying out an accommodation with children search on the booking page
    Given the User is on the booking page
    When he enters the data necessary to realize the search
    And he includes children in te search
    Then he looks at the hosting with children options
