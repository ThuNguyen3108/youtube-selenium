package buoi13;
import Initialization.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Handle_RadioButton extends Init {
    public static void main(String[] args) throws Exception {
        Setup();
        driver.navigate().to("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        Thread.sleep(1000);

        WebElement radio_Male = driver.findElement(By.xpath("//input[@name='optradio'"));
        if(radio_Male.isSelected() == true) {
            System.out.println("Male da duoc chon roi.");
        }
        else {
            System.out.println("Male chua duoc chon. ");
            radio_Male.click();
            System.out.println("Male da duoc chon. ");
        }
        Thread.sleep(1000);
        WebElement radio_Female = driver.findElement(By.xpath("label"));
        if(radio_Female.isSelected() == true) {
            System.out.println("Female cung dang duoc chon. => Sai");
        }
        else {
            System.out.println("Female khong duoc chon. => Dung");
        }
        // Group radio button
        WebElement radio_Age_5_15 = driver.findElement(By.xpath("//input[@value='5 - 15'"));
        ((JavascriptExecutor) driver).executeAsyncScript("arguments[0].scrollIntoView(true);", radio_Age_5_15);
        Thread.sleep(5000);
        radio_Age_5_15.click();

        WebElement button_GetValues = driver.findElement(By.xpath(""));
        button_GetValues.click();

        WebElement text_Age_Value = driver.findElement(By.xpath(""));
        System.out.println(text_Age_Value.getText());

        if(text_Age_Value.getText().contains("Age group: 5 - 15"))
        {
            System.out.println("Đã chọn tuổi từ 5 -> 15");
        }
        else {
            System.out.println("Chưa chọn đúng tuổi 5 -> 15");
        }

        TearDown();
        /*
        * equals: so sánh bằng, tìm kiếm chnh xác
        * contains: so sánh chứa, tìm kiếm tương đối
        * */
    }
}
