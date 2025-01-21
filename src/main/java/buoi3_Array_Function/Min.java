package buoi3_Array_Function;

public class Min {
    // khong tra ve (tu khoa 'void' truoc ten ham)
    static void min(int arr[]) {
        int min = arr[0];
        // lay ra gia tri tai vi tri 0
        for(int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println(min);
    }

    public static int max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main (String[] args) {
        int a[] = {33, 3, 4, 5};
        min(a);
        int b = max(a);
        System.out.println(b);

    }

    /*
    Khong tra ve (void) khi minh goi ham do va khong the gan gia tri trong ham cho thang nao khac

    Trả về => khi gọi tên hàm có nghĩa là lấy giá trị trong hàm đó gán cho mot cai gì đó (biến chẵn hạn)

    * */


}
