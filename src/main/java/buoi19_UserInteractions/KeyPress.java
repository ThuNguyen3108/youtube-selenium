package buoi19_UserInteractions;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KeyPress {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        // Set up Chrome WebDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void InputText() throws AWTException, InterruptedException {
        try {
            // Navigate to the website
            driver.get("https://anhtester.com/");

            // Wait for 1 second to ensure the page is loaded
            Thread.sleep(1000);

            // Locate the search input field
            WebElement inputCourseElement = driver.findElement(By.name("key"));

            // Click on the input field to focus
            inputCourseElement.click();

            // Initialize Robot class
            Robot robot = new Robot();

            // Simulate typing "TEST"
            robot.keyPress(KeyEvent.VK_T);
            robot.keyRelease(KeyEvent.VK_T);

            robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_E);

            robot.keyPress(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_S);

            robot.keyPress(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_S);

            robot.keyPress(KeyEvent.VK_T);
            robot.keyRelease(KeyEvent.VK_T);

            // Wait briefly before pressing Enter
            Thread.sleep(1000);

            // Simulate pressing Enter
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

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

