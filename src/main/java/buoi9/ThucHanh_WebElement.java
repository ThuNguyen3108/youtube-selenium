package buoi9;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ThucHanh_WebElement {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();

        // Khởi chạy ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://anhtester.com");
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("nguyenthianhthu3108.work@gmail.com");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("abc123abc");
        Thread.sleep(2000);

        WebElement button_LoginAccount = driver.findElement(By.id("login"));
        button_LoginAccount.click();
        Thread.sleep(2000);
    }
}
