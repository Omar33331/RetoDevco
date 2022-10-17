package co.com.booking.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.booking.com/")
public class BookingHomePage extends PageObject {

    public static final Target DESTINY_LABEL = Target.the("Label to search the destiny ").located(By.id("ss"));
    public static final Target START_DATE_LABEL = Target.the("Start date field").located(By.xpath("//div[@class='xp__dates-inner xp__dates__checkin']"));
    public static final Target SELECT_DATE = Target.the("Select te date in the calendar").locatedBy("//ancestor::td[@data-date='{0}']");
    public static final Target NEXT_MONTH_ARROW = Target.the("Arrow to select the next month").located(By.xpath("//div[contains(@data-bui-ref,'calendar-next')]"));
    public static final Target PEOPLE_AND_ROOMS_LABEL = Target.the("Label to select the number of people and rooms").located(By.id("xp__guests__toggle"));
    public static final Target NUMBER_OF_ADULTS = Target.the("Amount of adults selected").located(By.xpath("(//span[@class='bui-stepper__display'])[1]"));
    public static final Target REMOVE_ADULTS = Target.the("Arrow to decrease the amount of adults").located(By.xpath("(//button[contains(@aria-label,\"Adultos\")])[1]"));
    public static final Target ADD_ADULTS = Target.the("Arrow to increase the amount of adults").located(By.xpath("(//button[contains(@aria-label,\"Adultos\")])[2]"));
    public static final Target NUMBER_OF_CHILDREN = Target.the("Amount of children selected").located(By.xpath("(//span[@class='bui-stepper__display'])[2]"));
    public static final Target ADD_CHILDREN = Target.the("Arrow to increase the amount of children").located(By.xpath("(//button[contains(@aria-label,\"Niños\")])[2]"));
    public static final Target REMOVE_CHILDREN = Target.the("Arrow to decrease the amount of children").located(By.xpath("(//button[contains(@aria-label,\"Niños\")])[1]"));
    public static final Target NUMBER_BEDROOMS = Target.the("Amount of bedrooms selected").located(By.xpath("(//span[@class='bui-stepper__display'])[3]"));
    public static final Target ADD_BEDROOMS = Target.the("Arrow to increase the amount of bedrooms").located(By.xpath("(//button[contains(@aria-label,\"Habitaciones\")])[2]"));
    public static final Target REMOVE_BEDROOMS = Target.the("Arrow to remove the amount of bedrooms").located(By.xpath("(//button[contains(@aria-label,\"Habitaciones\")])[1]"));
    public static final Target SEARCH_BUTTON = Target.the("Button to perform the search").located(By.xpath("//button/span[@class = \"js-sb-submit-text \"]"));
    public static final Target SEARCH_RESULT = Target.the("Search result").located(By.xpath("//div/h1[@class='e1f827110f d3a14d00da']"));
    public static final Target SEARCH_RESULT_ERROR = Target.the("Error message in the search").located(By.xpath("(//div/div[@class='fe_banner__message'])[2]"));
}
