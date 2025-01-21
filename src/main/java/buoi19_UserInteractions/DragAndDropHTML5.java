package buoi19_UserInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;

public class DragAndDropHTML5 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Khởi tạo WebDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public boolean dragAndDropHTML5(WebElement fromElement, WebElement toElement) {
        try {
            Robot robot = new Robot();
            robot.mouseMove(0, 0);

            // Lấy tọa độ của element cần kéo
            int X1 = fromElement.getLocation().getX() + (fromElement.getSize().getWidth() / 2);
            int Y1 = fromElement.getLocation().getY() + (fromElement.getSize().getHeight() / 2);
            System.out.println("From Element Coordinates: " + X1 + " , " + Y1);

            // Lấy tọa độ của element cần thả
            int X2 = toElement.getLocation().getX() + (toElement.getSize().getWidth() / 2);
            int Y2 = toElement.getLocation().getY() + (toElement.getSize().getHeight() / 2);
            System.out.println("To Element Coordinates: " + X2 + " , " + Y2);

            // Điều chỉnh tọa độ nếu cần (thường cộng thêm do vị trí header của browser)
            int headerOffset = 120; // Độ cao header trình duyệt (tùy chỉnh nếu cần)
            robot.mouseMove(X1, Y1 + headerOffset);
            Thread.sleep(1000);

            // Nhấn chuột trái tại vị trí element cần kéo
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

            Thread.sleep(1000);

            // Di chuyển chuột đến vị trí element cần thả
            robot.mouseMove(X2, Y2 + headerOffset);
            Thread.sleep(1000);

            // Nhả chuột trái
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            return true;
        } catch (Exception e) {
            System.out.println("Error during drag and drop: " + e.getMessage());
            return false;
        }
    }

    @Test
    public void demoDragAndDropHTML5() throws InterruptedException {
        // Truy cập trang web demo
        driver.get("https://ui.vision/demo/webtest/dragdrop/");
        Thread.sleep(2000);

        // Bắt element cần kéo
        WebElement fromElement = driver.findElement(By.xpath("//a[@id='one']"));

        // Bắt element cần thả đến
        WebElement toElement = driver.findElement(By.xpath("//div[@id='bin']"));

        Thread.sleep(1000);

        // Gọi hàm thực hiện drag and drop
        boolean isSuccess = dragAndDropHTML5(fromElement, toElement);
        if (isSuccess) {
            System.out.println("Drag and Drop was successful.");
        } else {
            System.out.println("Drag and Drop failed.");
        }

        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        // Đóng trình duyệt sau khi chạy
        if (driver != null) {
            driver.quit();
        }
    }
}
