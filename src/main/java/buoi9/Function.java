package buoi9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
- Khi nhập mà có bắt validate button thì:
- Verify button đã bị disable
- Nhập liệu
- Verify nút đã được bật (enabled)
- Click

stype display:none -> Không hiện phần tử này lên
isDisplayed
* */

/*
- clear()
- sendKeys()
- click()
- isDisplayed()
- isEnabled()
* */
public class Function {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebElement element = driver.findElement(By.id("Username"));
        boolean status = element.isEnabled();

        if (status) {
            element.sendKeys("AnhTester");
        }
    }
}
