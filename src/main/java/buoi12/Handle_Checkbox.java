package buoi12;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import Initialization.*;

import static Initialization.Init.*;

public class Handle_Checkbox {
//    static Init init = new Init();
    public static void main(String[] args) throws Exception{
        Setup();
        driver.navigate().to("https://demoqa.com/checkbox");

        Boolean isSelected = driver.findElement(By.xpath("//span[@class='rct-checkbox']")).isSelected();
        Thread.sleep(1000);

        if(isSelected == false) {
            System.out.println("Chua duoc chon. ");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@class='rct-checkbox']//*[name()='svg']")).click();
            Thread.sleep(1000);
            System.out.println("Vua duoc chon xong. ");
            WebElement messString = driver.findElement(By.xpath("//span[normalize-space()='You have selected :']"));

            if (messString.isDisplayed() == true) {
                System.out.println("Message hien thi");
                messString.getText();
            } else {
                System.out.println("Message khong hien thi");
            }
        }
        else {
            System.out.println("Da duoc chon");
        }

        // -- Multi Checkbox ---
        // Kiem tra nút "Check All" có text là "Check All"
        WebElement button_CheckAll = driver.findElement(By.xpath("//input[@id='check1'"));
        ((JavascriptExecutor) driver).executeAsyncScript("arguments[0].scrollIntoView(true);",button_CheckAll);
        Thread.sleep(5000);
        System.out.println(button_CheckAll.getAttribute("value"));
        if(button_CheckAll.getAttribute("value").toString() == "Check All") {
            // (button_CheckAll.getText() == "Check All"
            button_CheckAll.click();
        }
        else {
            System.out.println("Khong phai Text/ Khong lay duoc Text");
        }

//        WebElement Checkbox1 = driver.findElement(By.xpath("//"));

        if(button_CheckAll.isSelected() == true)
        {
            System.out.println("Đã được chọn.");
        }

        TearDown();

    }
    /* Dynamic Report in XUnit Selenium C#
    - Kiem tra nut "Check All" co text la "Check All"
    - Kiem tra tat ca cac checkbox da duoc selected
    - Kiem tra nut "Check All" co text la "Uncheck All"
    * */

}
