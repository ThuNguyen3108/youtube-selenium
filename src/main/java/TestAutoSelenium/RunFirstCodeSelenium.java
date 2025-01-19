package TestAutoSelenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunFirstCodeSelenium {
    public static void main(String[] args) {
        // Tự động tải và thiết lập phiên bản ChromeDriver phù hợp
        WebDriverManager.chromedriver().setup();

        // Khởi chạy ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Điều hướng tới một trang web
//        driver.get("https://www.google.com");

//        1 - Maximize browser
        driver.manage().window().maximize();
        driver.navigate().to("https://anhtester.com");

        // 2 - Chuyen qua che do fullscreen
//        driver.manage().window().fullscreen();

        // In tiêu đề của trang
        System.out.println("Page title is: " + driver.getTitle());

        try {
            Thread.sleep(2000);  // Dừng 2 giây
        } catch (InterruptedException e) {
            e.printStackTrace();  // In ra chi tiết lỗi nếu có
        }

        // Đóng trình duyệt
        driver.quit();
    }
}
