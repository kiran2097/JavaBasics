package ArrayList;

public class PrefixSum {
    public static void main(String[] args) {
        //WAP to find prefix sum of array
        // arr1 = [1, 2, 3, 4]
        // prefix sum of array = [1, 1+2, 1+2+3, 1+2+3+4]
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 3, 6, 2};

        int[] result = prefixSum(arr1);
//        System.out.println(result);
        for (int ele: result) {
            System.out.print(ele + " ");
        }
        System.out.println();
        int[] result1 = prefixSum(arr2);
//        System.out.println(result);
        for (int ele: result1) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    private static int[] prefixSum(int[] arr1) {
        int[] result = new int[arr1.length];
        result[0] = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            result[i] = result[i-1] + arr1[i];
        }
        return result;
    }
}
