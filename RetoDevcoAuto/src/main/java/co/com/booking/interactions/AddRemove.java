package co.com.booking.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddRemove implements Interaction {

    private String amount;
    private Target actualAmount;
    private Target addArrow;
    private Target removeArrow;
    private int actual;
    private int required;

    public AddRemove(String amount, Target actualAmount, Target addArrow, Target removeArrow){
        this.amount = amount;
        this.actualAmount = actualAmount;
        this.addArrow = addArrow;
        this.removeArrow = removeArrow;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actual = Integer.parseInt(actualAmount.resolveFor(actor).getText());
        required = Integer.parseInt(amount);
        while (!(actualAmount).resolveFor(actor).getText().equals(amount)) {
            if(actual > required){
                actor.attemptsTo(
                        Click.on(removeArrow)
                );
            }else {
                actor.attemptsTo(
                        Click.on(addArrow)
                );
            }
        }
    }

    public static AddRemove peopleAndRooms(String amount, Target actualAmount, Target addArrow, Target removeArrow){
        return instrumented(AddRemove.class, amount, actualAmount, addArrow, removeArrow);
    }
}
