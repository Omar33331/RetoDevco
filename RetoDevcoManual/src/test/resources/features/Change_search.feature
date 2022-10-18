
Feature: The user change search during reserve

  @HostingManual1
  Scenario: the user change search during reserve
    Given the User is during reserve
    When the user change search
    Then the user get the reserve site