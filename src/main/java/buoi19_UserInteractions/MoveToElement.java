package buoi19_UserInteractions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class MoveToElement {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        // instantiate the driver
        WebDriver driver = new ChromeDriver();

        // maximise the window
        driver.manage().window().maximize();
        driver.get("https://anhtester.com/");

        WebElement element = driver.findElement(
                By.xpath("//h2[contains(text(),'Kiến thức Automation Testing')]"));

        Actions action = new Actions(driver);

        //Move to element (di chuyển tới title Kiến thức Automation Testing)
        action.moveToElement(element).build().perform();
        System.out.println("Chay hoan tat");

        Thread.sleep(2000);
        driver.quit();
    }
}
