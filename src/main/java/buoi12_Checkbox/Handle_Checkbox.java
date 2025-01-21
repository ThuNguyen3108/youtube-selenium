package buoi12_Checkbox;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.junit.Assert;

import java.util.List;

import static Initialization.Init.*;

public class Handle_Checkbox {
    public static void main(String[] args) throws Exception {
        Setup();
        driver.navigate().to("https://demoqa.com/checkbox");

        Boolean isSelected = driver.findElement(By.xpath("//span[@class='rct-checkbox']")).isSelected();
        Thread.sleep(1000);

        if (isSelected == false) {
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
        } else {
            System.out.println("Da duoc chon");
        }

        // -- Multi Checkbox ---
        WebElement button_CheckAll = driver.findElement(By.xpath("//input[@id='check1'"));
        ((JavascriptExecutor) driver).executeAsyncScript("arguments[0].scrollIntoView(true);", button_CheckAll);
        Thread.sleep(5000);
        System.out.println(button_CheckAll.getAttribute("value"));
        if (button_CheckAll.getAttribute("value").trim().toString().equals("Check All")) {
            button_CheckAll.click();
        } else {
            System.out.println("Khong phai Text/ Khong lay duoc Text");
        }

        // Duyệt qua các checkbox
        List<WebElement> listCheckbox = driver.findElements(By.xpath("//input[@id='check1'"));
        System.out.println(listCheckbox.size());
        for (int i = 0; i < listCheckbox.size(); i++) {
            WebElement checkbox = listCheckbox.get(i);  // Lấy checkbox từ danh sách
            if (checkbox.isSelected()) {
                System.out.println("Check box thứ " + (i + 1) + " đã được chọn. ");
            } else {
                System.out.println("Sai. Checkbox thứ " + (i + 1) + " chưa được chọn");
//                Assert.assertTrue("Checkbox thứ " + (i + 1) + " chưa được chọn.", checkbox.isSelected());  // Sử dụng Assert.assertTrue
            }
        }

        // Kiểm tra nút "Uncheck All"
        WebElement button_UnCheckAll = driver.findElement(By.xpath("//input[@id='check1'"));
        System.out.println(button_UnCheckAll.getAttribute("value"));
        if (button_UnCheckAll.getAttribute("value").trim().toString().equals("Uncheck All")) {
            System.out.println("Da chuyen thanh Uncheck All");
        } else {
            System.out.println("Chua duoc chuyen thanh Uncheck All");
        }

        TearDown();
        /* Kiem tra Checkbox Dong (nhieu cai 1 luot)
        - Kiem tra nut 'CheckAll' co text la "Check All"
        - Kiem tra tat ca cac checkbox da dc selected
        - Kiem tra nut CheckAll chuyen text thanh UncheckAll

        - Radio thì chỉ được chọn 1 giá trị trong 1 list cac tuy chon thuoc kieu Radio button
        - Kiem tra nut da duoc chon chua
        - Chon nó
        - Kiểm tra lại chỉ 1 nút trên được chọn, còn lại không được chọn
        * */


        /* Su khac biet giua getText() va getAttribute

        * */
    }
}
