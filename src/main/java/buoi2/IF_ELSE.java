package buoi2;

public class IF_ELSE {
    public static void main(String[] args) {
//        int age = 20;
//
//        if (age == 18) {
//            System.out.println(" 2 thang nay bang nhau. ");
//        }
//        else {
//            System.out.println(" 2 thang nay khac nhau. ");
//        }
        int marks = 65;
        if (marks < 50) {
            System.out.println("Tạch ! ");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Xếp loại D");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Xếp loại C");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Xếp loại B");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Xếp loại A");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("Xếp loại A+");
        } else {
            System.out.println("Giá trị không hợp lệ!");
        }
    }
}
