package Recursion2;

public class FirstOccurence {

    public static void main(String[] args) {
        int[] arr = {3, 1, 6, 2, 8, 6, 5};
        int x = 6;
        System.out.println(f(arr, 0, x));
    }

    private static int f(int[] arr, int idx, int x) {
        if(idx >= arr.length) return -1;
        if (arr[idx] == x) return idx;
        return f(arr, idx + 1, x);
    }


}
