package co.com.booking.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class InitialSetupt {

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }
}
