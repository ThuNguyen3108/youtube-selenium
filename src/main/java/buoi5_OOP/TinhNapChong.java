package buoi5_OOP;


class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

/*
object là instance của 1 class

phương thức static thuộc về class, phương thức instance thuộc về instance
có thể sử dụng phương thức static thông qua trực tiếp class
chỉ có thể s/d pt instance thông qua object

Trong phương thức static chỉ được gọi phương thức static thôi, muốn s/d pt instance trong
static thì phải khởi tạo object

trong phương thức object muốn s/d pt static thì có thể gọi thông qua class

* */

public class TinhNapChong {
    public static void main(String[] args) {
        // bien static la bien global nen chung ta da khai bao nó ra rồi thì nó toàn cục không

        System.out.println("Vi du ve nap chong:");
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));
    }
}
