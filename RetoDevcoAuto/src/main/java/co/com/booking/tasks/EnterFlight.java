package co.com.booking.tasks;

import co.com.booking.interactions.AddRemove;
import co.com.booking.interactions.Close;
import co.com.booking.interactions.SelectDates;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.booking.models.Data.take;
import static co.com.booking.userinterfaces.BookingHomePage.FLIGHTS_BUTTON;
import static co.com.booking.userinterfaces.BookingHomePage.NEXT_MONTH_ARROW;
import static co.com.booking.userinterfaces.BookingHomePage.SELECT_DATE;
import static co.com.booking.userinterfaces.FlightsPage.ADD_ADULTS_FLIGHT;
import static co.com.booking.userinterfaces.FlightsPage.AMOUNT_OF_ADULTS;
import static co.com.booking.userinterfaces.FlightsPage.DESTINY_SEARCH;
import static co.com.booking.userinterfaces.FlightsPage.NEXT_MONT;
import static co.com.booking.userinterfaces.FlightsPage.OK_MODAL_BUTTON;
import static co.com.booking.userinterfaces.FlightsPage.ORIGIN_FIRST_OPTION;
import static co.com.booking.userinterfaces.FlightsPage.ORIGIN_LABEL;
import static co.com.booking.userinterfaces.FlightsPage.ORIGIN_SEARCH;
import static co.com.booking.userinterfaces.FlightsPage.ORIGIN_SELECTED;
import static co.com.booking.userinterfaces.FlightsPage.REMOVE_ADULTS_FLIGHT;
import static co.com.booking.userinterfaces.FlightsPage.SEARCH_FLIGHTS_BUTTON;
import static co.com.booking.userinterfaces.FlightsPage.SELECT_DATE_FLIGHT;
import static co.com.booking.userinterfaces.FlightsPage.SELECT_PEOPLE;
import static co.com.booking.userinterfaces.FlightsPage.START_DATE_TRAVEL;
import static co.com.booking.utils.NumberConstants.THREE;
import static co.com.booking.utils.NumberConstants.TWO;
import static co.com.booking.utils.StringConstants.ADULTS;
import static co.com.booking.utils.StringConstants.DESTINY;
import static co.com.booking.utils.StringConstants.END_DATE;
import static co.com.booking.utils.StringConstants.ORIGIN;
import static co.com.booking.utils.StringConstants.START_DATE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
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
                Click.on(DESTINY_SEARCH),
                Type.theValue(take(DESTINY.getValue())).into(DESTINY_SEARCH),
                WaitUntil.the(ORIGIN_FIRST_OPTION, isPresent()).forNoMoreThan(TWO.getValue()).seconds(),
                Hit.the(Keys.ARROW_DOWN,Keys.ENTER).into(DESTINY_SEARCH),
                Click.on(START_DATE_TRAVEL),
                SelectDates.toSearch(take(START_DATE.getValue()),take(END_DATE.getValue()),SELECT_DATE_FLIGHT,NEXT_MONT),
                Click.on(SEARCH_FLIGHTS_BUTTON)
        );

    }

    public static EnterFlight details() {
        return instrumented(EnterFlight.class);
    }

}
