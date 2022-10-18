#languaje:en

Feature: see details about flight in a web site

  @HostingManual1
  Scenario: Selection round trip on the booking site
    Given the user get best flight
    When the user select see flight
    Then the user get your flight to