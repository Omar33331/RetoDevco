package co.com.booking.tasks;

import co.com.booking.interactions.AddRemove;
import co.com.booking.interactions.Close;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.booking.models.Data.take;
import static co.com.booking.userinterfaces.BookingHomePage.FLIGHTS_BUTTON;
import static co.com.booking.userinterfaces.FlightsPage.ADD_ADULTS_FLIGHT;
import static co.com.booking.userinterfaces.FlightsPage.AMOUNT_OF_ADULTS;
import static co.com.booking.userinterfaces.FlightsPage.DESTINY_LABEL;
import static co.com.booking.userinterfaces.FlightsPage.DESTINY_SEARCH;
import static co.com.booking.userinterfaces.FlightsPage.OK_MODAL_BUTTON;
import static co.com.booking.userinterfaces.FlightsPage.ORIGIN_FIRST_OPTION;
import static co.com.booking.userinterfaces.FlightsPage.ORIGIN_LABEL;
import static co.com.booking.userinterfaces.FlightsPage.ORIGIN_SEARCH;
import static co.com.booking.userinterfaces.FlightsPage.ORIGIN_SELECTED;
import static co.com.booking.userinterfaces.FlightsPage.REMOVE_ADULTS_FLIGHT;
import static co.com.booking.userinterfaces.FlightsPage.SELECT_PEOPLE;
import static co.com.booking.utils.NumberConstants.THREE;
import static co.com.booking.utils.NumberConstants.TWO;
import static co.com.booking.utils.StringConstants.ADULTS;
import static co.com.booking.utils.StringConstants.ORIGIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class EnterFlight implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FLIGHTS_BUTTON),
                Click.on(SELECT_PEOPLE),
                AddRemove.peopleAndRooms(take(ADULTS.getValue()),AMOUNT_OF_ADULTS,ADD_ADULTS_FLIGHT,REMOVE_ADULTS_FLIGHT),
                Click.on(OK_MODAL_BUTTON),
                Click.on(ORIGIN_LABEL),
                Close.label(ORIGIN_SELECTED),
                Click.on(ORIGIN_SEARCH),
                Type.theValue(take(ORIGIN.getValue())).into(ORIGIN_SEARCH),
                WaitUntil.the(ORIGIN_FIRST_OPTION, isPresent()).forNoMoreThan(TWO.getValue()).seconds(),
                Hit.the(Keys.ARROW_DOWN,Keys.ENTER).into(ORIGIN_SEARCH),
                WaitUntil.the(ORIGIN_FIRST_OPTION, isNotPresent()).forNoMoreThan(THREE.getValue()).seconds(),
                Click.on(DESTINY_LABEL),
                WaitUntil.the(DESTINY_SEARCH, isEnabled()).forNoMoreThan(THREE.getValue()).seconds(),
                Click.on(DESTINY_SEARCH),
                Hit.the(Keys.ARROW_DOWN,Keys.ENTER).into(DESTINY_SEARCH)

        );

    }

    public static EnterFlight details() {
        return instrumented(EnterFlight.class);
    }

}
