package buoi17_TestAnnotation;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends BaseTest{
        @Test(priority = 1)
        public void LoginPage() {
            driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }
        @Test(priority = 2)
        public void OpenPostManagement() throws Exception{
            driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
//        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
//        driver.findElement(By.xpath(""));

//            WebElement genderEnabled = driver.findElement(By.xpath("(//input[@value='1'])[1]"));
//            ((JavascriptExecutor) driver).executeAsyncScript("arguments[0].scrollIntoView(true);",genderEnabled);
//            Thread.sleep(10000);
//            if (genderEnabled.isDisplayed() && genderEnabled.isEnabled()) {
//                if (genderEnabled.isSelected()) {
//                    System.out.println("Đã được chọn");
//                    genderEnabled.click();
//                } else {
//                    System.out.println("Chưa được chọn");
//                }
//            } else {
//                System.out.println("Phần tử không khả dụng");
//            }
        }
}
