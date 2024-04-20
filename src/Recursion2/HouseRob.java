package Recursion2;

public class HouseRob {

    public static void main(String[] args) {

        int[] arr = {3, 1, 1, 9};
        System.out.println(f(arr, 0));
    }

    private static int f(int[] arr, int idx) {
        if (idx >= arr.length) return 0;
        return Math.max(arr[idx] + f(arr, idx + 2), 0 + f(arr, idx + 1));
    }
}
