package buoi10;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ThucHanh_WebElement_1 {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();

        // Khởi chạy ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//        driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']//span[1]")).click();
//
        driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
//        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
//        driver.findElement(By.xpath(""));

        WebElement genderEnabled = driver.findElement(By.xpath("(//input[@value='1'])[1]"));
        ((JavascriptExecutor) driver).executeAsyncScript("arguments[0].scrollIntoView(true);",genderEnabled);
        Thread.sleep(10000);
        if (genderEnabled.isDisplayed() && genderEnabled.isEnabled()) {
            if (genderEnabled.isSelected()) {
                System.out.println("Đã được chọn");
                genderEnabled.click();
            } else {
                System.out.println("Chưa được chọn");
            }
        } else {
            System.out.println("Phần tử không khả dụng");
        }


        // dropdown tĩnh và dropdown động

        Thread.sleep(4000);
        System.out.println("Chạy hoàn tất");
        driver.quit();


    }
}
