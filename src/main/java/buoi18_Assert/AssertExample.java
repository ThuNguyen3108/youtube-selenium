package buoi18_Assert;

import buoi17_TestAnnotation.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class AssertExample extends BaseTest {
    @Test
    public void UpdateProfile() throws Exception{
        driver.navigate().to("sign-in");
        driver.findElement(By.xpath("//")).sendKeys("nguyenthianhthu3108.work@gmail.com");
        driver.findElement(By.xpath("//")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Sign In'")).click();
        driver.findElement(By.xpath("//input[@id='Pin']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@id='RequestPinForm_SubmitButton']")).click();


        driver.findElement(By.xpath("//p[normalize-space()='My Profile'")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='twelve wide column']//button[1]"));
        // lay element cua title
        WebElement headerEditInformation = driver.findElement(By.xpath("Edit Personal Information 2"));
        headerEditInformation.getText().contains("Edit Personal");

        //  nguyen ham nay tra ve true va false
        assertTrue(headerEditInformation.getText().contains("123"));


        driver.findElement(By.xpath("//input[@id='LastName'")).clear();
        driver.findElement(By.xpath("//input[@id='LastName'")).sendKeys("Employee");

        /* automation la cuoi cung roi, vi no khong the explore testing thi no có thể xảy ra bug
        automation 70-80 la good roi, con he thong don gian la 90% la OKE roi
        học xong rồi thể hiện trình độ của mình
        * */

    }
}
