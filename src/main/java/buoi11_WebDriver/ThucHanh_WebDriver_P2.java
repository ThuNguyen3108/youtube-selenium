package buoi11_WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ThucHanh_WebDriver_P2 {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://testpages.herokuapp.com/styled/frames/frames-test.html");
        Thread.sleep(2000);

        // Chuyển đến khung Frame (giữa) để bắt element bên trong
        driver.switchTo().frame("middle");
        Thread.sleep(1000);
        String itemMiddle = driver.findElement(By.xpath("//li[@id='middle0']")).getText();
        System.out.println(itemMiddle);
        Thread.sleep(1000);

        System.out.println("Chay hoan tat");
        driver.quit();

        
    }
}
