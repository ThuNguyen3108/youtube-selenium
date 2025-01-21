package buoi4_OOP;

import java.util.Scanner;

public class Student_1 {
    // thuoc tinh
    protected String name;
    protected int age;
    // phuong thuc
    // hien thi thong tin
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // nhap thong tin
    public void getInformation(Scanner sc) {
        System.out.println("Nhap vao ten: ");
        name = sc.nextLine();
        System.out.println("Nhap vao tuoi: ");
        age = sc.nextInt();
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Khai bao doi tuong
        Student_1 sv = new Student_1();
        // Nhap thong tin
        sv.getInformation(sc);
        // Hien thi thong tin
        System.out.println("Thong tin vua nhap la: ");
        sv.display();
        sc.close();
    }
}
