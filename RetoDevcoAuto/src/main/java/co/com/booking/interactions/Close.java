package co.com.booking.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Close implements Interaction {

    private Target tab;

    public Close(Target tab){
        this.tab=tab;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(tab.resolveFor(actor).isPresent()){
            actor.attemptsTo(
                    Click.on(tab)
            );
        }
    }

    public static Close label(Target tab){
        return instrumented(Close.class, tab);
    }
}
