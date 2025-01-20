package buoi10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {
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

        driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();

        WebElement genderEnabled = driver.findElement(By.xpath("(//label[normalize-space()='Male'])[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", genderEnabled);
        Thread.sleep(2000);

//        final String parentWindowHandle = driver.getWindowHandle();
//        final String[] windowHandles = driver.getWindowHandles().toArray(new String[0]);
//            if(windowHandles.length < 2) {
//                System.out.println("Khong xuat hien Modal");
//            }
//            if (windowHandles[0].equals(parentWindowHandle)) {
//                driver.switchTo().window(windowHandles[1]);
//                System.out.println("Đa chuyen qua modal.");
//            } else {
//                driver.switchTo().window(windowHandles[0]);
//                System.out.println("Van con o window handle dau tien");
//            }

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
        /*
        * Trả về Chưa được chọn là đúng rồi */

        Thread.sleep(4000);
        System.out.println("Chạy hoàn tất");
        driver.quit();
    }
}
