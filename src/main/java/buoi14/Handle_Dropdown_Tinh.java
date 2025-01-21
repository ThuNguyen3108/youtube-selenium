package buoi14;
import Initialization.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.ui.Select;
import Validate.*;

public class Handle_Dropdown_Tinh extends Init{
    public static void main(String[] args) throws Exception {
        HelperValidate validate = new HelperValidate();
        Setup();
        driver.navigate().to("https://www.w3schools.com/css/css_dropdowns.asp");
        Thread.sleep(2000);
        // Handle Dropdown tinh
        // Lay element cua the "select" html

        WebElement element = driver.findElement(By.xpath("//button[@class='dropbtn']"));
        ((JavascriptExecutor) driver).executeAsyncScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(5000);
        element.click();

        // Khai bao doi tuong kieu Select cho element tren
        // Lay theo Text hien thi
        Select selectSimple = new Select(element);
        selectSimple.selectByVisibleText("Link 1");
        System.out.println("Da chon Link 1");
        Thread.sleep(1000);

        // Lay theo value cua the Option
        selectSimple.selectByValue("Link 1");
        System.out.println("Da chon Link 1");
        Thread.sleep(1000);

        // Lay theo vi tri cua the Option
        // Neu lay theo Index thi vi tri bat dau tu 0
        selectSimple.selectByIndex(1);
        System.out.println("Da chon Link 1");

        // Kiem tra co phai dang Multi Select hay khong
        selectSimple.isMultiple();
        if(selectSimple.isMultiple() == true) {
            System.out.println("Day la dang Multi Select");
        } else {
            System.out.println("Khong phai dang Multi Select");
        }
        validate.checkText(element, "ABC");

        Thread.sleep(1000);
        // Kiem tra so luong the Option
        System.out.println(selectSimple.getOptions().size());

        // Kiem tra gia tri cua Option duoc chon
        Thread.sleep(1000);
        System.out.println(selectSimple.getFirstSelectedOption().getText());

        if(selectSimple.getFirstSelectedOption().getText() == "Click 1")
        {
            System.out.println("Chon dung");
        }else{
            System.out.println("Chon sai");
        }

        Thread.sleep(1000);
        List<WebElement> getAllOption = selectSimple.getOptions();

        ArrayList<WebElement> getAllOption1 = (ArrayList<WebElement>) selectSimple.getOptions();
        for(int i = 0; i < getAllOption.size(); i++)
        {
//            System.out.println(getAllOption.get(i).getText());
            System.out.println(getAllOption.get(i).getAttribute("value"));
        }

        System.out.println("Chay duoc roi!!!");
        TearDown();

    }

}
