package buoi4;

class A {
    private int data = 40;
    private void msg() {
        System.out.println("Hello Java");
    }
}

class B_Protected {
    protected void msg() {
        System.out.println("Hello Java");
    }
}
public class PhamViTruyCap {
    public static void main(String[] args) {
        // khoi tao lop
        A obj = new A();
//        System.out.println(obj.data);
//        obj.msg();
    }
}

// default là mình dùng trong 1 package thôi còn khác package thì không được
// protected access modified được truy cập bên trong package ngoài package thì phải kế thừa