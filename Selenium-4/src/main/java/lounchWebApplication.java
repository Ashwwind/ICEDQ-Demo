import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class lounchWebApplication {

    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the desired URL
        driver.get("https://api.icedq.net/");

        // Optional: Maximize the browser window
        driver.manage().window().maximize();

        // Optional: Add a wait or close the browser after some time
        // driver.quit(); // Uncomment to close the browser after execution
    }
}
