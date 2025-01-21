package buoi4_OOP;

public class Student {
    public String name;
    public int age;
    public float height;
    public static String universityName = "Kteam education";
    public static int total = 0; // khi khoi tao student lan 1 thi total = 1, biến toàn cục
    public Student(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
        total += 1;
    }
}

// class <tên lớp con> extends <tên lớp cha> {}
/*
<tên lớp cha> gọi là lớp được kế thừa/ lớp cơ sở
<tên lớp con> gọi là lớp kế thừa/ lớp dẫn xuat

* */
