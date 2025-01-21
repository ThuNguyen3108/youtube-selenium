package buoi19_UserInteractions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class createScreenCapture {

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
    public void createScreenCapture() throws InterruptedException, AWTException, IOException {
        // Navigate to the website
        driver.get("https://anhtester.com/");
        Thread.sleep(1000); // Wait for page to load

        // Initialize Robot class
        Robot robot = new Robot();

        // Get the screen size of the browser
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("Screen size: " + screenSize);

        // Define a rectangle with the size of the screen
        Rectangle screenRectangle = new Rectangle(screenSize);

        // Capture the screen within the defined rectangle
        BufferedImage image = robot.createScreenCapture(screenRectangle);

        // Save the captured image as a PNG file
        File file = new File("TestImageRobot.png");
        ImageIO.write(image, "png", file);

        System.out.println("Screenshot saved as: " + file.getAbsolutePath());

        Thread.sleep(1000); // Wait to observe the result
    }

    @AfterTest
    public void teardown() {
        // Quit the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
