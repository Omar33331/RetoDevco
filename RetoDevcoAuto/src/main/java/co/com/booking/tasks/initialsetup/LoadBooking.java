package co.com.booking.tasks.initialsetup;

import co.com.booking.exceptions.LoadPageException;
import co.com.booking.userinterfaces.BookingHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoadBooking implements Task {

    private BookingHomePage bookingHomePage;

    @Override
    @Step("{0} opens the browser on the Booking Home Page")
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.attemptsTo(Open.browserOn(bookingHomePage));
        }catch (Exception e){
            throw new LoadPageException(LoadPageException.FAILED_PAGE_LOAD, e);
        }

    }

    public static LoadBooking page() {
        return instrumented(LoadBooking.class);
    }
}
