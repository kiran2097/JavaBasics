package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {56, 86, 34, 87, 67, 54};
        int len = arr.length;
        int lastIndex = len - 1;
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < (len/2); i++) {
            int temp = arr[i];
            arr[i] = arr[lastIndex - i];
            arr[lastIndex - i] = temp;
        }
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }
}
