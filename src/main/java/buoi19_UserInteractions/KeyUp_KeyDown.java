package buoi19_UserInteractions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class KeyUp_KeyDown {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        // Set up the Chrome WebDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @Test
    public void InputTextUppercase() {
        try {
            // Navigate to Google
            driver.get("https://www.google.com/");

            // Locate the search bar using a simplified XPath
            WebElement searchBar = driver.findElement(By.xpath("//input[@name='q']"));

            // Initialize Actions class
            Actions action = new Actions(driver);

            // Hold down SHIFT and type text in uppercase
            action.keyDown(searchBar, Keys.SHIFT)
                    .sendKeys("anh tester")
                    .keyUp(Keys.SHIFT)
                    .build()
                    .perform();

            // Wait to observe the result
            Thread.sleep(2000);
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
