#languaje: en

Feature: The user change search during reserve

  @ChangeSearchManual1
  Scenario: the user change search during reserve
    Given the User search the reserve hosting
    When the user change the selected options of search
    Then the user get the update search