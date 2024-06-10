package LeetCode;

public class RemoveDuplicateArray {
        public int removeDuplicates(int[] nums) {
            int[] found = new int[101];
            int[] negativeFound = new int[101];
            int j = 0;
            // 0 at 101 location
            // -100 at 0th location
            for ( int i = 0; i < nums.length; i++) {
                if(nums[i]<0) {
                    negativeFound[Math.abs(nums[i])] = 1;
                } else {
                    found[nums[i]] = 1;
                }}
            for (int i = 101; i > 0; i--) {
                if(negativeFound[i] > 0)
                {
                    nums[j] = -i;
                    j++;
                }
            }
            for(int i = 0; i< 101; i++) {
                if (found[i] > 0) {
                    nums[j] = i;
                    j++;
                }
            }
            return j;
        }

    public static void main(String[] args) {

    }
    }

