package buoi19_UserInteractions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class dragAndDrop {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Khởi tạo WebDriver và mở trình duyệt
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testDragAndDrop() throws InterruptedException {
        // Truy cập trang web
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Thread.sleep(1000);

        // Bắt element cần kéo
        WebElement from = driver.findElement(By.xpath("//div[@id='box6']"));
        // Bắt element cần thả đến
        WebElement to = driver.findElement(By.xpath("//div[@id='box106']"));

        Thread.sleep(1000);

        // Sử dụng Actions để thực hiện thao tác kéo và thả
        Actions action = new Actions(driver);
        action.dragAndDrop(from, to).build().perform();

        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        // Đóng trình duyệt
        if (driver != null) {
            driver.quit();
        }
    }
}
