import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample {public static void main(String[] args) {
    WebDriver driver = setupWebDriver();
    driver.get("https://www.google.com");

    try {
        Thread.sleep(5000); // Sleep for 5000 milliseconds (5 seconds)
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.quit();

}
    private static WebDriver setupWebDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

}
