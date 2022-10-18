package co.com.booking.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TouristAttractionsPage {

    public static final Target TOURIST_DESTINY = Target.the("Destiny where the user want go").located(By.xpath("//div/input[contains(@data-testid, 'search-input-field')]"));
    public static final Target FIRST_DESTINY = Target.the("First destiny of the list where the user want go").located(By.xpath("(//li/a[contains(@data-testid, 'search-bar-result')])[1]"));
    public static final Target TOURIST_CALENDAR = Target.the("Open the calendar to select dates").located(By.xpath("//div[contains(@class, 'css-1alcapd')]"));
    public static final Target SELECT_TOURIST_DATES = Target.the("Select the date to travel").locatedBy("//td/span[@data-date='{0}']");
    public static final Target NEXT_MONT_ARROW_TOURIST = Target.the("Arrow to select the next mont").located(By.xpath("(//span[contains(@class, 'b6dc9a9e69 e6c50852bd')])[2]"));
    public static final Target TOURIST_SEARCH = Target.the("Button to search a car for the rental").located(By.xpath("(//button/span[contains(@class, 'e57ffa4eb5')])[3]"));
    public static final Target CONFIRMATION_SEARCH = Target.the("Label to confirm the realized search").located(By.xpath("(//div/h1[contains(@class, '1f827110f css-1uk1gs8')])"));
}
