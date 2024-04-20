package Recursion2;

public class MaximumArrayElement {

    public static void main(String[] args) {

        int[] arr = {21, 33, 43, 23, 76,45};
        System.out.println(f(arr, 0));
    }

    public static int f(int[] arr, int idx) {
        if (idx >= arr.length)
            return arr[arr.length - 1];
        return Math.max(arr[idx], f(arr, idx + 1));
    }
}
