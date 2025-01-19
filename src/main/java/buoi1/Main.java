package buoi1;

public class Main {
    public String name = "Auto";
    public String ten1;
    public static String ten2 = "Nguyen Van A";
    public void getInfo() {
        System.out.println("Ten: " + ten1);
        // de thuc hien nhieu lenh trong do, den khi goi thi chỉ gọi hàm thôi ko cần phải gọi 1 nùi trong đó
    }


    public static void main(String[] args) {
        int n = 10;
        System.out.println("Hello world!");
        System.out.println("Ten: " + ten2); // static nen co the goi lai duoc
    }
}

