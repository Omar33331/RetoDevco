#languaje: en

Feature: Book the airport taxis

  @HAirportManual1
  Scenario: Selection the airport taxis
    Given the user enter to booking web site
    When the user select airport taxis
    And the user select pickup location destination hour and passengers
    Then the user get choose the taxi