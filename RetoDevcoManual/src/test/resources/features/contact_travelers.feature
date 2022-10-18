#languaje:en

Feature: Connect with other travellers in the booking page

  @TripManual1
  Scenario: Connect with other travellers
    Given the User is on the booking page
    When the user select one of the communities in "connect with other travelers"
    Then the user can see the community page selected

