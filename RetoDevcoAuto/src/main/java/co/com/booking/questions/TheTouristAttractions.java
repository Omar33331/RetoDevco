package co.com.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

import static co.com.booking.models.Data.take;
import static co.com.booking.userinterfaces.TouristAttractionsPage.CONFIRMATION_SEARCH;
import static co.com.booking.utils.StringConstants.DESTINY;

public class TheTouristAttractions implements Question<Boolean> {

    private String destiny;

    @Override
    @Step("{3} validate the search result")
    public Boolean answeredBy(Actor actor) {
        destiny = CONFIRMATION_SEARCH.resolveFor(actor).getText();
        return destiny.contains(take(DESTINY.getValue()));
    }

    public static TheTouristAttractions found() {
        return new TheTouristAttractions();
    }
}
