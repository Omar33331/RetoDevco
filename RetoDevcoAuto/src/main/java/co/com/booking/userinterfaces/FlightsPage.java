package co.com.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightsPage {

    public static final Target SELECT_PEOPLE = Target.the("Button to select the people who are going to travel").located(By.xpath("//span/div[@data-testid='input_occupancy_desktop_passengers_trigger']"));
    public static final Target AMOUNT_OF_ADULTS = Target.the("Amount of adults selected to fly").located(By.xpath("(//div/div[@class='css-1uzx2ul'])[1]"));

    public static final Target ADD_ADULTS_FLIGHT = Target.the("Arrow to increase the amount of adults for the flight").located(By.xpath("(//div/button[@class='css-153jucu'])[1]"));
    public static final Target REMOVE_ADULTS_FLIGHT = Target.the("Arrow to decrease the amount of adults for the flight").located(By.xpath("(//div/button[@class='css-1od6d6y'])[1]"));
    public static final Target OK_MODAL_BUTTON = Target.the("Button to select the amount of people who are going to travel").located(By.xpath("//div/button[@data-testid='input_occupancy_desktop_done']"));
    public static final Target ORIGIN_LABEL = Target.the("Origin label  of the flight").located(By.xpath("//div[contains(@aria-label, 'De')]"));
    public static final Target ORIGIN_SELECTED = Target.the("Origin label  of the flight").located(By.xpath("//span[@class='css-1lq4ejz']"));
    public static final Target ORIGIN_SEARCH = Target.the("Origin label  of the flight").located(By.xpath("//div/input[contains(@data-testid, 'origin_input')]"));
    public static final Target ORIGIN_FIRST_OPTION = Target.the("First option of the origin filter").located(By.xpath("(//span[@class='bui-checkbox__label'])[1]"));
    public static final Target DESTINY_LABEL = Target.the("Origin label  of the flight").located(By.xpath("//div[contains(@aria-label, 'A')]"));
    public static final Target DESTINY_SEARCH = Target.the("Origin label  of the flight").located(By.xpath("//div/input[contains(@data-testid,'destination_input')]"));
}
