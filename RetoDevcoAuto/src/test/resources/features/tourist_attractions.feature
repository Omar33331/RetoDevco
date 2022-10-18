#languaje:en

Feature: Carrying out a tourist search in booking page

  @Tourist1
  Scenario Outline: Carrying out a tourist search in booking page
    Given that Omar is on the booking page
      |  destiny  |  startDate  |  endDate  |
      | <destiny> | <startDate> | <endDate> |
    When he select touristic attractions and fill in the fields with your data
    Then he looks the options available for visit in the selected place
    Examples:
      |    destiny    |  startDate |  endDate   |
      |   San Andres  | 2022-12-05 | 2022-12-15 |