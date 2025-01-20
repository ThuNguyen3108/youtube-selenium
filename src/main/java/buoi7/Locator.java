package buoi7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ObjectLoginPage.*;
import ObjectLoginPage.Object;

public class Locator {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://anhtester.com");

        System.out.println("Page title is: " + driver.getTitle());

        Thread.sleep(2000);
        // button, input, link, dropdown, dialog, header_Page
        WebElement button_Login = driver.findElement(By.id("btn-login"));
        button_Login.click();
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("autotest@mailinator.com");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123456");
        Thread.sleep(2000);

        WebElement button_LoginAccount = driver.findElement(By.id("login"));
        button_LoginAccount.click();
        Thread.sleep(2000);

//        WebElement link_Posts = driver.findElement(By.linkText("Posts Management"));
        WebElement link_Posts = driver.findElement(By.partialLinkText("Posts Management"));
        // linkText la href
        link_Posts.click();
        Thread.sleep(2000);
        WebElement tagnameDive = driver.findElement(By.tagName("div"));
        tagnameDive.getText();
        Thread.sleep(2000);

       // <button class="btn-dang-bai" style="background-color: #fff; color: #000; font-size: 16px;">Đăng Bài</button>
        WebElement button_DangBai = driver.findElement(By.cssSelector(".btn-dang-bai"));
        button_DangBai.click();

        driver.findElement(By.cssSelector("a[id='btn-dangbai']")).click();
        driver.findElement(By.cssSelector("a[class='btn']")).click();

        Object ob = new Object();
        ob.email1.click();
        driver.findElement(By.xpath("//a[@id='btn-dangbai']")).click();


        // Web Element

//        WebElement password = driver.findElement(By.name("password"));
//        WebElement password = driver.findElement(By.name("password"));
//        WebElement password = driver.findElement(By.name("password"));
//        WebElement password = driver.findElement(By.name("password"));
//        WebElement password = driver.findElement(By.name("password"));

        // Đóng trình duyệt
        driver.quit();
    }
}
