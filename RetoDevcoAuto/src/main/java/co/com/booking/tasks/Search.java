package co.com.booking.tasks;

import co.com.booking.interactions.AddRemove;
import co.com.booking.interactions.SelectDates;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.thucydides.core.annotations.Step;

import static co.com.booking.models.Data.take;
import static co.com.booking.userinterfaces.BookingHomePage.ADD_ADULTS;
import static co.com.booking.userinterfaces.BookingHomePage.ADD_BEDROOMS;
import static co.com.booking.userinterfaces.BookingHomePage.ADD_CHILDREN;
import static co.com.booking.userinterfaces.BookingHomePage.DESTINY_LABEL;
import static co.com.booking.userinterfaces.BookingHomePage.NEXT_MONTH_ARROW;
import static co.com.booking.userinterfaces.BookingHomePage.NUMBER_BEDROOMS;
import static co.com.booking.userinterfaces.BookingHomePage.NUMBER_OF_ADULTS;
import static co.com.booking.userinterfaces.BookingHomePage.NUMBER_OF_CHILDREN;
import static co.com.booking.userinterfaces.BookingHomePage.PEOPLE_AND_ROOMS_LABEL;
import static co.com.booking.userinterfaces.BookingHomePage.REMOVE_ADULTS;
import static co.com.booking.userinterfaces.BookingHomePage.REMOVE_BEDROOMS;
import static co.com.booking.userinterfaces.BookingHomePage.REMOVE_CHILDREN;
import static co.com.booking.userinterfaces.BookingHomePage.SEARCH_BUTTON;
import static co.com.booking.userinterfaces.BookingHomePage.SELECT_DATE;
import static co.com.booking.userinterfaces.BookingHomePage.START_DATE_LABEL;
import static co.com.booking.utils.StringConstants.ADULTS;
import static co.com.booking.utils.StringConstants.BEDROOMS;
import static co.com.booking.utils.StringConstants.CHILDREN;
import static co.com.booking.utils.StringConstants.DESTINY;
import static co.com.booking.utils.StringConstants.END_DATE;
import static co.com.booking.utils.StringConstants.START_DATE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Search implements Task {

    public static Search hosting() {
        return instrumented(Search.class);
    }

    @Override
    @Step("{2} enter the information to search for accommodation")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(DESTINY_LABEL),
                Type.theValue(take(DESTINY.getValue())).into(DESTINY_LABEL),
                Click.on(START_DATE_LABEL),
                SelectDates.toSearch(take(START_DATE.getValue()),take(END_DATE.getValue()),SELECT_DATE,NEXT_MONTH_ARROW),
                Click.on(PEOPLE_AND_ROOMS_LABEL),
                AddRemove.peopleAndRooms(take(ADULTS.getValue()),NUMBER_OF_ADULTS,ADD_ADULTS,REMOVE_ADULTS),
                AddRemove.peopleAndRooms(take(CHILDREN.getValue()),NUMBER_OF_CHILDREN,ADD_CHILDREN,REMOVE_CHILDREN),
                AddRemove.peopleAndRooms(take(BEDROOMS.getValue()),NUMBER_BEDROOMS,ADD_BEDROOMS,REMOVE_BEDROOMS),
                Click.on(SEARCH_BUTTON)
        );
    }
}
