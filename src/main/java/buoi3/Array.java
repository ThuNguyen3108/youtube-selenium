package buoi3;

public class Array {
    // gan 1 gia tri bat ky vao vi tri dinh danh ma minh mong muon
    /*
    - dataType phai chung kieu du lieu
    - [] bat buoc (tuan theo cau truc Mang)
    - Ten mang tuan theo quy tac dat ten da noi phan tren
    - size la do dai cua mang. La so nguyen (int)
    * */
    public static void main(String[] args) {
        // gán mảng đặc danh
        // nếu mà string hay int thì quy nó là string hết
//        int a[] = {33, 3, 4, 5};
        String a[] = new String[3];

        a[0] = "10";
        a[1] = "20";
        a[2] = "50";
        // in mang ra man hinh
        // chay tu 0 den be hon do dai cua mang a la 3 (0->2)
//        for (int i = 0; i < a.length; i ++) {
//            System.out.println(a[i] + " ");
//        }
        System.out.println(a[0] + a[1]);
        int number0 = Integer.valueOf(a[0]).intValue();
        int number1 = Integer.valueOf(a[1]).intValue();
        System.out.println(number0 + number1);
    }
}
