package RecusionAssignment;

public class ReverseTheArray {

    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 9, 6, 17, 19, 78, 6, 56, 43, 23};
        reverseArray(arr, 0);
        for (int ele:
                arr) {
            System.out.print(ele + " ");
        }
    }


    private static void reverseArray(int[] arr, int idx) {
        if(idx > (arr.length)/2 - 1) return;
        int t = arr[idx];
        arr[idx] = arr[arr.length - idx - 1];
        arr[arr.length - idx - 1] = t;
        reverseArray(arr, idx + 1);
    }
}
