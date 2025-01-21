package buoi5_OOP;

class Bike {
    void run() {
        System.out.println("Chạy bo");
    }
}
public class TinhDaHinh extends Bike{
    void run() {
        System.out.println("Chay khoang 40km/gio");
    }

    void stop() {
        System.out.println("Stop");
    }

    public static void main(String[] args) {
        Bike bk = new Bike();
        Bike bk1 = new TinhDaHinh();
        TinhDaHinh bk2 = new TinhDaHinh(); // sử dụng của thằng cha và con
        bk.run();
        bk1.run();
        bk2.stop();
        bk2.run();
    }
    // thang con thi chi goi duoc con thoi
    // thang cha khong the goi thang con
}

// stop 56:04
