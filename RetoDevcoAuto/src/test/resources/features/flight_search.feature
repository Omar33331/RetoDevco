#languaje:en

Feature: Carrying out an flights search in booking page

  @Flights1
  Scenario Outline: Carrying out an flights search in booking page
    Given that Omar is on the booking page
      |  origin  |  destiny  |  startDate  |  endDate  |  adults  |
      | <origin> | <destiny> | <startDate> | <endDate> | <adults> |
    When he enters the information for the flight
    Then He looks at the available flight options
    Examples:
      |    origin    | destiny |  startDate |  endDate   | adults |
      |   Medellín   | Bogota  | 2022-11-05 | 2022-11-15 |    2   |
  #    | Barranquilla | Neiva   | 2022-12-05 | 2023-01-15 |    3   |