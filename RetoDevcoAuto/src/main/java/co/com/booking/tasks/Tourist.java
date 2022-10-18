package co.com.booking.tasks;

import co.com.booking.interactions.SelectDates;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.booking.models.Data.take;
import static co.com.booking.userinterfaces.BookingHomePage.TOURIST_BUTTON;
import static co.com.booking.userinterfaces.TouristAttractionsPage.FIRST_DESTINY;
import static co.com.booking.userinterfaces.TouristAttractionsPage.NEXT_MONT_ARROW_TOURIST;
import static co.com.booking.userinterfaces.TouristAttractionsPage.SELECT_TOURIST_DATES;
import static co.com.booking.userinterfaces.TouristAttractionsPage.TOURIST_CALENDAR;
import static co.com.booking.userinterfaces.TouristAttractionsPage.TOURIST_DESTINY;
import static co.com.booking.userinterfaces.TouristAttractionsPage.TOURIST_SEARCH;
import static co.com.booking.utils.NumberConstants.THREE;
import static co.com.booking.utils.StringConstants.DESTINY;
import static co.com.booking.utils.StringConstants.END_DATE;
import static co.com.booking.utils.StringConstants.START_DATE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Tourist implements Task {


    @Override
    @Step("{2} enter the information to search a tourist destiny")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TOURIST_BUTTON),
                Click.on(TOURIST_DESTINY),
                Type.theValue(take(DESTINY.getValue())).into(TOURIST_DESTINY),
                WaitUntil.the(FIRST_DESTINY, isClickable()).forNoMoreThan(THREE.getValue()).seconds(),
                Click.on(FIRST_DESTINY),
                //WaitUntil.the(FIRST_DESTINY, isNotVisible()).forNoMoreThan(ONE.getValue()).seconds(),
                Click.on(TOURIST_CALENDAR),
                SelectDates.toSearch(take(START_DATE.getValue()),take(END_DATE.getValue()),SELECT_TOURIST_DATES,NEXT_MONT_ARROW_TOURIST),
                Click.on(TOURIST_SEARCH)
        );

    }

    public static Tourist attractions() {
        return instrumented(Tourist.class);
    }
}
