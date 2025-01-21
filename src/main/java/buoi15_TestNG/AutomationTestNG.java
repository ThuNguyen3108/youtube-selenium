package buoi15_TestNG;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.junit.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AutomationTestNG {
    public static WebDriver driver = null;

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test Execution");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void Demo1() {
        System.out.println("TestNG Test Method");
        driver.navigate().to("https://anhtester.com");
    }

    @Test
    public void Demo2() {
        System.out.println("TestNG Test Method");
        driver.navigate().to("https://automationblogvn.com/topic-1-tong-quan-ve-testng/");
    }
    @Test
    public void Demo3() {
        System.out.println("TestNG Test Method");
        driver.navigate().to("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
    }

    @AfterTest
    public void afterTest() throws Exception {
        System.out.println("After Test Execution");
        Thread.sleep(2000);
        driver.quit();
    }
}
