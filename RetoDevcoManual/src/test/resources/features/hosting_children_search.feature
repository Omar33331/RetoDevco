#languaje:en

Feature: Make a search of hosting with children in booking page

  @HostingManual1
  Scenario: Carrying out an accommodation with children search on the booking page
    Given the User is on the booking page
    When he enters the data necessary to realize the search
    And he includes children in te search
    Then he looks at the hosting with children options

  @HostingManual2
  Scenario: Select a result option
    Given the User made a hosting search
    When he select one of results
    Then he can see the active reserve

  @HostingManual3
  Scenario: Introduce contact details the booking site
    Given the user have a selected reserve
    When the user select standard ticket
    Then web site required contact details
