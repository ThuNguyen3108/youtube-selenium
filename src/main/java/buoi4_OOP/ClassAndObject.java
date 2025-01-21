package buoi4_OOP;

class TestClass {
    public int number1 = 10;
    public int number2 = 20;
    public int Cong(int a, int b) {
        return a + b;
    }

    public void Print(int a, int b) {
        System.out.println(Cong(a,b));
    }
}

public class ClassAndObject {

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        //Khoi tao 1 object thuoc 1 class
        TestClass obClass = new TestClass();
        PhamViTruyCap phamViTruyCap = new PhamViTruyCap();
        phamViTruyCap.msg();
//        obClass.Print(a,b); // cach goi ra cac thanh phan trong 1 class thong qua object

    }
}
