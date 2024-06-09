package RecusionAssignment;

public class PalindromeArray {
    // Write a recursive program to take 'n' sized array and return boolean value if it's palindrome or not.

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 4, 1};
        int[] arr1 = {1, 3, 3, 1, 3, 1};
        int[] arr2 = {2, 6, 4, 9, 6, 17, 19, 78, 6, 56, 43, 23};
        System.out.println(palindromeArr(arr1, 0));
    }

    private static boolean palindromeArr(int[] arr, int idx) {
        if(idx > (arr.length)/2 - 1) return true;
        if (arr[idx] != arr[arr.length - 1 - idx])
            return false;
        return palindromeArr(arr, idx + 1);
    }
}
