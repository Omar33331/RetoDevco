package co.com.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightsPage {

    public static final Target SELECT_PEOPLE = Target.the("Button to select the people who are going to travel").located(By.xpath("//span/div[@data-testid='input_occupancy_desktop_passengers_trigger']"));
    public static final Target AMOUNT_OF_ADULTS = Target.the("Amount of adults selected to fly").located(By.xpath("(//div/div[@class='css-1uzx2ul'])[1]"));

    public static final Target ADD_ADULTS_FLIGHT = Target.the("Arrow to increase the amount of adults for the flight").located(By.xpath("(//div/button[@class='css-153jucu'])[1]"));
    public static final Target REMOVE_ADULTS_FLIGHT = Target.the("Arrow to decrease the amount of adults for the flight").located(By.xpath("(//div/button[@class='css-1od6d6y'])[1]"));
    public static final Target OK_MODAL_BUTTON = Target.the("Button to select the amount of people who are going to travel").located(By.xpath("//div/button[@data-testid='input_occupancy_desktop_done']"));
    public static final Target ORIGIN_LABEL = Target.the("Origin label of the flight").located(By.xpath("//div[contains(@aria-label, 'De')]"));
    public static final Target ORIGIN_SELECTED = Target.the("Origin label of the search flight").located(By.xpath("//span[@class='css-1lq4ejz']"));
    public static final Target ORIGIN_SEARCH = Target.the("Origin label  of the flight").located(By.xpath("//div/input[contains(@data-testid, 'origin_input')]"));
    public static final Target ORIGIN_FIRST_OPTION = Target.the("First option of the origin filter").located(By.xpath("(//span[@class='bui-checkbox__label'])[1]"));
    public static final Target DESTINY_SEARCH = Target.the("Origin label  of the flight").located(By.xpath("//div/input[contains(@data-testid,'destination_input')]"));
    public static final Target START_DATE_TRAVEL = Target.the("Label to select the date of start reservation").located(By.xpath("(//div[contains(@data-testid, 'searchbox_date_picker_desktop_calendar_undefined')])[1]"));
    public static final Target NEXT_MONT = Target.the("Arrow to see the next mont").located(By.xpath("(//span[contains(@class,'Button-module__icon___VeFvi')])[5]"));
    public static final Target SELECT_DATE_FLIGHT = Target.the("Select the date to travel").locatedBy("//span/span[@data-date-cell='{0}']");
    public static final Target SEARCH_FLIGHTS_BUTTON = Target.the("Button to search te flights").locatedBy("//button[contains(@data-testid,'searchbox_submit')]");
    public static final Target SEARCH_RESUL_ORIGIN = Target.the("Label to confirm the result of search origin").locatedBy("(//div/div[contains(@data-testid,'departure_airport')])[1]");
    public static final Target SEARCH_RESULT_DESTINY = Target.the("Label to confirm the result of search destiny").locatedBy("(//div/div[contains(@data-testid,'destination_airport')])[1]");


}
