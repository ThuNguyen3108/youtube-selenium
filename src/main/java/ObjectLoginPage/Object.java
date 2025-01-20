package ObjectLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Object {
    WebDriver driver = new ChromeDriver();
    public WebElement email1 = driver.findElement(By.name("email"));
}
