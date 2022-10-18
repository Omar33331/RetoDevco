package co.com.booking.manual.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/service_help.feature",
        glue = "co.com.booking.manual.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ServiceHelpRunner {
}
