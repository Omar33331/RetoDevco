package co.com.booking.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/flight_search.feature",
        glue = "co.com.booking.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class FlightSearchRunner {
}
