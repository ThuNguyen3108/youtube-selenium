package buoi17_TestAnnotation;

import org.testng.annotations.*;

public class TestAnnotation_1 {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite: Chạy trước tất cả các test trong suite.");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite: Chạy sau tất cả các test trong suite.");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest: Chạy trước mỗi nhóm test (@Test) trong class.");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest: Chạy sau tất cả các nhóm test trong class.");
    }

    @BeforeGroups("group1")
    public void beforeGroups() {
        System.out.println("BeforeGroups: Chạy trước các test thuộc group 'group1'.");
    }

    @AfterGroups("group1")
    public void afterGroups() {
        System.out.println("AfterGroups: Chạy sau các test thuộc group 'group1'.");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass: Chạy trước @Test đầu tiên trong class hiện tại.");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass: Chạy sau tất cả các @Test trong class hiện tại.");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod: Chạy trước mỗi @Test.");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod: Chạy sau mỗi @Test.");
    }

    @Test(groups = "group1")
    public void test1() {
        System.out.println("Test1: Đây là test đầu tiên trong group 'group1'.");
    }

    @Test(groups = "group1")
    public void test2() {
        System.out.println("Test2: Đây là test thứ hai trong group 'group1'.");
    }

    @Test
    public void test3() {
        System.out.println("Test3: Đây là test không thuộc group nào.");
    }
}
