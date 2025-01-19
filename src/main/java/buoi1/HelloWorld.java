package buoi1;

public class HelloWorld {
//    public static String name = "A";
//    public static int tuoi = 5;
//    public static String diachi = "HaNoi";

    public String ten = "Anh Thu";
    public String tuoi = "23";
    public String congViec = "Tester";
    public String ngaySinh = "31/08/2001";

    public void getInfo() {
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Cong Viec: " + congViec);
        System.out.println("Ngay Sinh: " + ngaySinh);
    }
    public static void main(String[] args) {
        int n = 10;
        String name = "AnhTester";
        int age = 25;
        float weight = 65.5f;
        boolean sex = true;
        HelloWorld info = new HelloWorld();
//        info.getInfo();
        // ham ma co static chỉ được gọi lại những biến static
//        System.out.println("Hello Automation Testing");
//        System.out.println("Ten la: " + name);
//        System.out.println("Tuoi la: " + tuoi);
//        System.out.println("Dia chi la: " + diachi);
        // nếu kiểu float chứa số nguyên luôn được không
        // => nó được
        System.out.println(name);
    }
}
