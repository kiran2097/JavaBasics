package Array;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = -3;
        // resultant Array = {30, 40, 50, 10, 20}
        // k = -3 {40, 50, 10, 20, 30}
        // k = -2 {30, 40, 50, 10, 20}
        // k = -1 {20, 30, 40, 50, 10}
        // k = 0 {10, 20, 30, 40, 50}
        // k = 1 {50, 10, 20, 30, 40}
        // k = 2 {40, 50, 10, 20, 30}
        // k = 3 {30, 40, 50, 10, 20}
        // k = 4 {20, 30, 40, 50, 10}
        // k = 5 {10, 20, 30, 40, 50}
        // k = 6 {50, 10, 20, 30, 40}
        // if k > 0, then k % length of array
        // else k % length of array and k + length of array
        int len = arr.length;
        k %= len;
        if (k < 0) {
            k = k + len;
        }

        for (int i = 1; i <= k; i++) {
            int temp = arr[len - 1];
            for (int j = len - 1; j > 0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        for (int ele: arr) {
            System.out.print(ele + " ");
        }
    }
}
