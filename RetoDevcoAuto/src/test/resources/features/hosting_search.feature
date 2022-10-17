#languaje:en

Feature: Make a search of hosting in booking page

  @Hosting1
  Scenario Outline: Carrying out an accommodation search on the booking page
    Given that Omar is on the booking page
      |  destiny  |  startDate  |  endDate  |  adults  |  children  |  bedrooms  |
      | <destiny> | <startDate> | <endDate> | <adults> | <children> | <bedrooms> |
    When he enters the search data
    Then he looks at the hosting options
    Examples:
      |   destiny   |  startDate  |  endDate   | adults | children | bedrooms |
      |  Medellín   | 2022-11-20  | 2022-12-05 |   1    |    0     |    1     |
      |  Cartagena  | 2022-10-20  | 2022-10-22 |   4    |    0     |    4     |
      |   Bogota    | 2022-12-25  | 2023-01-07 |   2    |    0     |    2     |


  @Hosting2
  Scenario Outline: Performing an accommodation search on the booking page with invalid dates
    Given that Omar is on the booking page
      |  destiny  |  startDate  |  endDate  |  adults  |  children  |  bedrooms  |
      | <destiny> | <startDate> | <endDate> | <adults> | <children> | <bedrooms> |
    When he enters the search data
    Then he looks the error message
    Examples:
      |   destiny   |  startDate  |  endDate   | adults | children | bedrooms |
      |    Cali     | 2022-11-20  | 2022-12-31 |   4    |    0     |    3     |