package co.com.booking.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

import static co.com.booking.userinterfaces.BookingHomePage.SEARCH_RESULT;
import static co.com.booking.utils.StringConstants.ACOMODATIONS_FOUND;

public class TheResult implements Question<Boolean> {

    private String expectedCity;

    @Override
    @Step("{3} validate the search result")
    public Boolean answeredBy(Actor actor) {
        expectedCity = SEARCH_RESULT.resolveFor(actor).getText();
        return expectedCity.contains(ACOMODATIONS_FOUND.getValue());
    }

    public static TheResult ofSearch() {
        return new TheResult();
    }
}
