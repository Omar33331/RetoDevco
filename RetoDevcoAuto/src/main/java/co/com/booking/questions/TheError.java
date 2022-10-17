package co.com.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.booking.userinterfaces.BookingHomePage.SEARCH_RESULT_ERROR;
import static co.com.booking.utils.StringConstants.ERROR_MESSAGE;

public class TheError implements Question<Boolean> {

    private String errorMessage;

    @Override
    public Boolean answeredBy(Actor actor) {
        errorMessage = SEARCH_RESULT_ERROR.resolveFor(actor).getText();
        return errorMessage.contains(ERROR_MESSAGE.getValue());
    }

    public static TheError Message() {
        return new TheError();
    }
}
