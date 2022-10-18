package co.com.booking.stepdefinitions;

import co.com.booking.exceptions.SearchException;
import co.com.booking.questions.TheTouristAttractions;
import co.com.booking.tasks.Tourist;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static co.com.booking.exceptions.SearchException.FAILED_SEARCH;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TouristAttractionsStepDefinitions {

    @When("^he select touristic attractions and fill in the fields with your data$")
    public void heSelectTouristicAttractionsAndFillInTheFieldsWithYourData() {
        theActorInTheSpotlight().attemptsTo(
                Tourist.attractions()
        );
    }


    @Then("^he looks the options available for visit in the selected place$")
    public void heLooksTheOptionsAvailableForVisitInTheSelectedPlace() {
        theActorInTheSpotlight().should(seeThat(
                TheTouristAttractions.found()).orComplainWith(
                SearchException.class, FAILED_SEARCH)
        );
    }

}
