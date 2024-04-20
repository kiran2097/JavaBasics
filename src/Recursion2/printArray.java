package Recursion2;

public class printArray {

    public static void f(int[] arr, int idx) {
        if(idx >= arr.length) return;
        System.out.println(arr[idx]);
        f(arr, idx + 1);
    }
    public static void main(String[] args) {
        int[] arr = {21, 33, 43, 23, 76,45};
        f(arr, 0);
    }
}
