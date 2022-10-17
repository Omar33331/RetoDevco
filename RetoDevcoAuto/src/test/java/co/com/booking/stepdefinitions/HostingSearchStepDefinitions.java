package co.com.booking.stepdefinitions;

import co.com.booking.questions.TheResult;
import co.com.booking.tasks.Load;
import co.com.booking.tasks.Search;
import co.com.booking.tasks.initialsetup.LoadBooking;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HostingSearchStepDefinitions {


    @Given("^that (.*) is on the booking page$")
    public void thatOmarIsOnTheBookingPage(String user,List<Map<String, Object>> data) {
        theActorCalled(user).wasAbleTo(
                LoadBooking.page(),
                Load.the(data)
        );
    }

    @When("^he enters the search data$")
    public void heEntersTheSearchData() {
        theActorInTheSpotlight().attemptsTo(
                Search.hosting()
        );

    }

    @Then("^he looks at the hosting options$")
    public void heLooksAtTheHostingOptions() {
        theActorInTheSpotlight().should(seeThat(TheResult.ofSearch()));
    }
}
