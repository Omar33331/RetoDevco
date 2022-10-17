package co.com.booking.stepdefinitions;

import co.com.booking.exceptions.SearchException;
import co.com.booking.questions.TheResult;
import co.com.booking.questions.TheSearch;
import co.com.booking.tasks.EnterFlight;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static co.com.booking.exceptions.SearchException.FAILED_SEARCH;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlightSearchStepDefinitions {

    @When("^he enters the information for the flight$")
    public void heEntersTheInformationForTheFlight() {
        theActorInTheSpotlight().attemptsTo(
                EnterFlight.details()
        );
    }


    @Then("^He looks at the available flight options$")
    public void heLooksAtTheAvailableFlightOptions() {
        theActorInTheSpotlight().should(seeThat(
                TheSearch.ofFlights()).orComplainWith(SearchException.class, FAILED_SEARCH));
    }
}
