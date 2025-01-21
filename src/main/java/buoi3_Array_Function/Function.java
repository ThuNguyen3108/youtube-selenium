package buoi3_Array_Function;

public class Function {
    static void InputData(int arr[], int number_value) {
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = number_value;
        }
    }

    static void PrintData(int arr[], int number) {
        for (int i = 0; i < arr.length; i ++) {
            System.out.println("Phan tu thu " + (i) + " la " + (arr[i] + number));
        }
    }
    public static void main(String[] args) {
//        int mang[] = new int[50];
//        int mang2[] = new int[100];
//        InputData(mang, 10);
//        PrintData(mang, 5);
//        InputData(mang2, 20);
//        PrintData(mang2, 5);
    }
}
