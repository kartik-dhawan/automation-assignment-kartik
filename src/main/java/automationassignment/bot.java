package automationassignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bot {

    private final WebDriver driver;

    public bot(){
        this.driver = new ChromeDriver();
    }

    public WebDriver getBot(){
        return driver;
    }
}
