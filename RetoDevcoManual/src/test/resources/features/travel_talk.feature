#languaje: en

Feature: Talk with other travelers through the web site

  @HostingManual1
  Scenario: Selection travel talk in the booking site
    Given the User enter to travel talk in the booking page
    When the user choose Travel communities, Ask a question
    And the user select question type
    Then the user get the options about question