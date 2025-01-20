package buoi11;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThucHanh_WebDriver {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
        Thread.sleep(5000);
        /*
        Lay tat ca cac doi tuong la the TH trong bang Table (HTML)
        table - tbody - tr-th-td
        * */
        List<WebElement> thList = driver.findElements(By.xpath("//ul"));
        for(int i = 0; i < thList.size(); i ++) {
//            System.out.println(thList.get(i).getText().contains("Leave"));
            System.out.println(thList.get(i).getText());
        }
        Thread.sleep(1000);
        System.out.println("Chay hoan tat !!!");
        driver.quit();

//        List<WebElement> thList = driver.findElements(By.xpath("/th"));
//        List<WebElement> iList = driver.findElements(By.xpath("//th/i"));

//        for(int i = 1; i < thList.size(); i ++) {
////            Chay tu 0 den be hon do dai cua cai List tren
//            // Va in ra gia tri Text cua the th ( the th trong table)
//            // Automation Tester (Test Lead)
//            if(iList.get(i).getText() != "") {
//                System.out.println(thList.get(i).getText().contains("an"));
//            }
//            else {
//                System.out.println(thList.get(i).getText().equals(dataTest[i]));
//            }
//        }

        /* Có cách nào để lấy những cái mà nó bị gom vô luôn
        * */

/*
        Sự khác biệt giữa maximize và fullscreen
        maximize là chrome còn nhỏ bấm vào nút vuông thì nó bung to ra
        fullscreen có nghĩa là bấm F11
* */
        // Tìm 1 element trong 1 cái khung Frame trên website (HTML - DOM)

    }
}
