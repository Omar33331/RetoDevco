#languaje:en

Feature: Carrying out an flights search in booking page

  @Flights1
  Scenario Outline: Carrying out an flights search in booking page
    Given that Omar is on the booking page
      |  origin  |  originShort  |  destiny  |  destinyShort  |  startDate  |  endDate  |  adults  |
      | <origin> | <originShort> | <destiny> | <destinyShort> | <startDate> | <endDate> | <adults> |
    When he enters the information for the flight
    Then He looks at the available flight options
    Examples:
      |    origin    | originShort | destiny | destinyShort |  startDate |  endDate   | adults |
      |   Medellín   |     MDE     | Bogota  |     BOG      | 2022-11-18 | 2022-12-15 |    2   |
      | Barranquilla |     BAQ     | Neiva   |     NVA      | 2022-12-05 | 2023-02-15 |    3   |