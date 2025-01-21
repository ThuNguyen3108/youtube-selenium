package chixinhcoding.a1_firstpackage;

import org.testng.annotations.Test;

public class firstclass {
    @Test (priority = 3)
    public void firstMethod() {
        System.out.println("Run method 1");
    }

    @Test (priority = 1)
    public void secondMethod() {
        System.out.println("Run method 2");
    }

    @Test (priority = 2)
    public void thirdMethod() {
        System.out.println("Run method 3");
    }
}
