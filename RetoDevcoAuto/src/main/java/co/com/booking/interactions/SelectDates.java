package co.com.booking.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectDates implements Interaction {

    private String startDate;
    private String endDate;
    private Target selectDate;
    private Target searchMonth;

    public SelectDates(String startDate, String endDate, Target selectDate, Target searchMonth){
        this.startDate = startDate;
        this.endDate = endDate;
        this.selectDate = selectDate;
        this.searchMonth = searchMonth;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        while (!(selectDate.of(startDate)).resolveFor(actor).isPresent()){
            actor.attemptsTo(
                    Click.on(searchMonth)
            );
        }
        actor.attemptsTo(
                Click.on(selectDate.of(startDate))
        );
        while (!(selectDate.of(endDate)).resolveFor(actor).isPresent()){
            actor.attemptsTo(
                    Click.on(searchMonth)
            );
        }
        actor.attemptsTo(
                Click.on(selectDate.of(endDate))
        );

    }

    public static SelectDates toSearch(String startDate, String endDate, Target selectDate, Target searchMonth){
        return instrumented(SelectDates.class, startDate, endDate, selectDate, searchMonth);
    }
}
