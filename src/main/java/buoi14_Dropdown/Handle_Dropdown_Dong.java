package buoi14_Dropdown;
import Initialization.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

public class Handle_Dropdown_Dong extends Init{
    public static void main(String[] args) throws Exception{
        Setup();
        driver.navigate().to("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        Thread.sleep(2000);

        /* Dropdown dong
        - Neu item khong trung thi sendKeys dung roi nhan Enter
        - Neu item trung thi sendKeys ten roi click cai ten (Text) can chon

        * */
        WebElement selectCountryElement = driver.findElement(By.xpath("//span[contains(text(),'Select a Country')]"));
//        Select selectCountry = new Select(element);
//        selectCountry.selectByVisibleText("Vietnam");
        selectCountryElement.click();
        WebElement inputCountryElement = driver.findElement(By.cssSelector("section.hero-wrapper.overflow-hidden:nth-child(3) div.container.z-index-1.position-relative:nth-child(3) div.row div.col-lg-12 div.main-search-input div.main-search-input-item.user-chosen-select-container:nth-child(2) div.chosen-container.chosen-container-single div.chosen-drop div.chosen-search > input:nth-child(1)"));
//        inputCountryElement.click();
//        Thread.sleep(5000);
        inputCountryElement.sendKeys("Vietnam");
        Thread.sleep(1000);

        // Khai bao doi tuong thuoc lop Actions de handle keyboard cua ban phim may tinh
        Actions action = new Actions(driver);

        // Ham build() de xay dung hanh dong cho action, ham perform() de xac nhan xay dung do
        action.sendKeys(Keys.ENTER).build().perform();

        // Robot nó hieu la keyboard tren ban phim
//        Robot robot = new Robot();

        TearDown();
    }
}
