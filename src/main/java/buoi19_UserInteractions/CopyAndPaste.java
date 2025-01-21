package buoi19_UserInteractions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;


public class CopyAndPaste {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        // Set up Chrome WebDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void ScrollPage() {
        try {
            // Navigate to the website
            driver.get("https://anhtester.com/");

            // Initialize Actions class
            Actions action = new Actions(driver);

            // Scroll down to the bottom of the page
            action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
            Thread.sleep(2000); // Short wait to observe scrolling

            // Scroll up to the top of the page
            action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
            Thread.sleep(2000); // Short wait to observe scrolling

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void teardown() {
        // Quit the browser
        if (driver != null) {
            driver.quit();
        }
    }
}

