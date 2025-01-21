package Validate;

import org.openqa.selenium.WebElement;

public class HelperValidate {
    public void checkText(WebElement element, String textValue) {
        if(element.getText() == textValue) {
            System.out.println(textValue + " da hien thi dung. ");
        } else {
            System.out.println(textValue + " chua hien thi. ");
        }
    }
}
