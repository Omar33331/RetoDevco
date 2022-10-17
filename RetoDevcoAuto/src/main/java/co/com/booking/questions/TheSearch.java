package co.com.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.booking.models.Data.take;
import static co.com.booking.userinterfaces.FlightsPage.SEARCH_RESULT_DESTINY;
import static co.com.booking.userinterfaces.FlightsPage.SEARCH_RESUL_ORIGIN;
import static co.com.booking.utils.StringConstants.DESTINY_SHORT;
import static co.com.booking.utils.StringConstants.ORIGIN_SHORT;

public class TheSearch implements Question<Boolean> {

    private String origin;
    private String destiny;


    @Override
    public Boolean answeredBy(Actor actor) {
        origin = SEARCH_RESUL_ORIGIN.resolveFor(actor).getText();
        destiny = SEARCH_RESULT_DESTINY.resolveFor(actor).getText();
        return origin.equals(take(ORIGIN_SHORT.getValue())) && destiny.equals(take(DESTINY_SHORT.getValue()));
    }

    public static TheSearch ofFlights() {
        return new TheSearch();
    }

}
