package LeetCode;

public class MinimumNumberGame {
    public static void main(String[] args) {

        int[] nums = {5, 2};
        int[] arr = new int[nums.length];
        int min;
        for(int i = 0; i < nums.length - 1; i++)
        {
            min = i;
            for( int j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[min]) {
                    min = j;
                }
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
        for(int i = 0; i < nums.length; i += 2) {
            arr[i] = nums[i+1];
            arr[i+1] = nums[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
