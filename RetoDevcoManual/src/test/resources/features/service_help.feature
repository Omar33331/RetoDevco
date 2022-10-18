#languaje:en
Feature: searching the customer service help

  @HostingManual1
  Scenario: Selection customer service help on the web site
    Given the User in the booking page
    When the user select customer service help
    Then the user get the option sign in