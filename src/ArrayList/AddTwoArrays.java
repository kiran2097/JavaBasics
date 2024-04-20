package ArrayList;

import java.util.ArrayList;

public class AddTwoArrays {
    public static void main(String[] args) {
        //WAP to sum of two arrays
        //arr1 = [5, 6, 7]
        //arr2 = [3, 4, 4, 2]
        //   [5, 6, 7]
        //[3, 4, 4, 2]
        // result = [4, 0, 0, 9]
        //arr1 =     [9, 9]
        // arr2 = [9, 9, 9]
        // result = [1, 0 ,9, 8]

        int[] arr1 = {5, 6, 7};
        int[] arr2 = {3, 4, 4, 2};
        int[] arr3 = {9, 9};
        int[] arr4 = {9, 9, 9};
        ArrayList<Integer> result1= SumOfArrays(arr1, arr2);
        ArrayList<Integer> result2= SumOfArrays(arr3, arr4);
        System.out.println(result1);
        System.out.println(result2);
    }

    private static ArrayList<Integer> SumOfArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = arr1.length - 1, j = arr2.length - 1, carry = 0;
        while(i >= 0 || j >= 0)
        {
            int sum = 0;
            if (i >= 0)
            {
                sum = sum + arr1[i];
                i--;
            }
            if (j >= 0) {
                sum = sum + arr2[j];
                j--;
            }
            sum = sum + carry;
            result.add(0, sum%10);
            carry = sum / 10;
        }
        if(carry > 0)
            result.add(0, carry);
        return result;
    }
}
