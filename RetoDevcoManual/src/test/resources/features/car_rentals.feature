#languaje:en

Feature: Make a search of car rentals at booking web site

  @RentManual1
  Scenario: Selection to car hire options to return the same location
    Given the User is on the booking site
    When the user enters currently location
    And the user enters start and finale date
    Then the user get the available cars