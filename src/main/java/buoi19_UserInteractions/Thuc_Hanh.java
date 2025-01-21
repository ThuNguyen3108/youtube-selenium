package buoi19_UserInteractions;

import Initialization.Init;
import buoi17_TestAnnotation.BaseTest;
import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Thuc_Hanh  extends BaseTest {
    @Test(priority = 1)
    public void TestDragAndDrop() throws InterruptedException {
        driver.get("https://jqueryui.com/droppable/");

        // Switch to the frame containing drag-and-drop elements
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        // Elements for drag and drop
        WebElement From = driver.findElement(By.id("draggable"));
        WebElement To = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);
        action.dragAndDrop(From, To).build().perform();
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
    }

    @Test(priority = 2)
    public void TestContextClick() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        // Element for right click
        WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions action = new Actions(driver);
        action.contextClick(button).build().perform();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void TestDoubleClick() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        // Element for double click
        WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

        Actions action = new Actions(driver);
        action.doubleClick(button).build().perform();
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void TestMoveToElement() {
        driver.get("https://www.ebay.com");

        // Element to hover over (Sign in dropdown on eBay)
        WebElement signInDropdown = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-ug")));

        Actions action = new Actions(driver);
        action.moveToElement(signInDropdown).perform();
    }

    @Test(priority = 5)
    public void TestHoverAndClick() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/hovers");

        // Hover over the first image and click on its link
        WebElement image = driver.findElement(By.xpath("(//div[@class='figure'])[1]"));
        WebElement link = driver.findElement(By.xpath("(//div[@class='figure'])[1]//a"));

        Actions action = new Actions(driver);
        action.moveToElement(image).pause(1000).click(link).build().perform();
        Thread.sleep(2000);
    }

}
