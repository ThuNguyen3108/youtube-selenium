package buoi19_UserInteractions;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

public class mousePress {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void mousePress() throws InterruptedException, AWTException {
        // Navigate to the website
        driver.get("https://anhtester.com/");
        Thread.sleep(1000); // Wait for page to load

        // Initialize Robot class
        Robot robot = new Robot();

        // Move mouse pointer to the specified x, y coordinates
        robot.mouseMove(1400, 200);

        // Delay to simulate user action
        robot.delay(1000);

        // Simulate left mouse button press
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

        // Simulate left mouse button release
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        // Wait to observe the result
        Thread.sleep(2000);
    }

    @AfterTest
    public void teardown() {
        // Quit the browser
        if (driver != null) {
            driver.quit();
        }
    }
}

