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
import org.testng.annotations.Test;

public class ActionsClass extends BaseTest {
    @Test
    public void TestAction()
    {
        /* 1 doi tuong se dai dien cho 1 lop, nen la trong lop co cai gi thi no se lay cai do ra
        * */

//        action.clickAndHold().moveToElement(null).sendKeys(null).build();
        // specify the URL of the webpage
        driver.get("https://www.google.com/");

        // specify the locator of the search box
        WebElement element = driver.findElement(
                By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/textarea[1]"));

        // create an object for the Actions class and pass the driver argument
        Actions action = new Actions(driver);

        // pass the product name that has to be searched in the website
//        action.sendKeys(element, "Anh Tester").build().perform();
        action.sendKeys(element, "Anh Tester");
        action.sendKeys(Keys.ENTER);

//        driver.findElement(By.xpath(""));

    }
}
