package Initialization;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Init {
    public static WebDriver driver = null;
    public static void Setup()
    {
        WebDriverManager.chromedriver().setup();

        // Khởi chạy ChromeDriver
//        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void TearDown() throws Exception
    {
//        Thread.sleep(2000);
        driver.quit();
    }

}
