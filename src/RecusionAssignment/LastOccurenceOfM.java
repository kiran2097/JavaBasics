package RecusionAssignment;

public class LastOccurenceOfM {
    // Take n size array and input number m, return the last index of 'm', if m is not found return -1.

    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 9, 6, 17, 19, 78, 6, 56, 43, 23};
        int len = arr.length - 1;
        int m = 3;

        System.out.println(f(arr, len, m));
    }

    private static int f(int[] arr, int idx, int m) {
        if(idx < 0)
            return -1;
        if (arr[idx] == m) return idx;
        return f(arr, idx -1, m);
    }
}
