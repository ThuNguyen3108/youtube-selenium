package buoi19_UserInteractions;

import buoi17_TestAnnotation.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass {

    @Test
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        // instantiate the driver
        WebDriver driver = new ChromeDriver();

        // maximise the window
        driver.manage().window().maximize();

        // specify the URL of the webpage
        driver.get("https://www.google.com/");

        // specify the locator of the search box
        WebElement element = driver.findElement(
                By.xpath("//textarea[@id='APjFqb']"));

        // create an object for the Actions class and pass the driver argument
        Actions action = new Actions(driver);

        // pass the product name that has to be searched in the website
        action.sendKeys(element, "Anh Tester").build().perform();

        action.sendKeys(Keys.ENTER).build().perform();

        Thread.sleep(2000);
        driver.quit();
    }
}