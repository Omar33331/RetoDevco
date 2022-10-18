#languaje:en

Feature: The user reserve the hosting on the web site

  @HostingManual1
  Scenario: the user select search on stays
    Given the User search hotels and choose one
    When the user click on reserve button
    Then the user get the room type