package ObjectLoginPage;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        // cho doi ngam, moi 1 dong thuc hien o dưới nó sẽ đợi 10s, không tìm thấy thì nó sẽ cho fail

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://anhtester.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='btn-login'")).click();
        driver.findElement(By.xpath("//input[@placeholder='Email'")).sendKeys("autotest@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc123abc");
        driver.findElement(By.xpath("//button[normalize-space()='login account'")).click();
        driver.findElement(By.partialLinkText("Posts")).click();
        boolean headerPost = driver.findElement(By.xpath("//h1[@class='text-primary'")).isDisplayed();
        if(headerPost == true) {
            System.out.println("Đã đến trang Posts.");
        }
        boolean buttonAddPost = driver.findElement(By.xpath("//a[@id='btn-dangbai'")).isEnabled();
        if(buttonAddPost == true) {
            driver.findElement(By.xpath("//a[@id='btn-dangbai'")).click();
        } else {
            System.out.println("Không click được");
        }
//        driver.findElement(By.xpath("Posts")).click();
//        driver.findElement(By.xpath("Posts")).click();
//        driver.findElement(By.xpath("Posts")).click();

        Thread.sleep(2000);
        driver.quit();
    }

}
