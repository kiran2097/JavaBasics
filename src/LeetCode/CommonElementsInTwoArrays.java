package LeetCode;

import java.util.ArrayList;

import static java.util.Arrays.sort;

public class CommonElementsInTwoArrays {
    public static void main(String[] args) {
        // nums1 = [4,3,2,3,1], nums2 = [2,2,5,2,3,6]
        int[] nums1 = {4,3,2,3,1};
        int[] nums2 = {2,2,5,2,3,6};
        int[] result = new int[2];
        int i, j, first = 0, second = 0;
        for(i=0; i < nums1.length; i++) {

            for (j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    first += 1;
                    break;
                }
            }
        }
        for(i=0; i < nums2.length; i++) {

            for (j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    second += 1;
                    break;
                }
            }
        }
        result[0] = first;
        result[1] = second;
    }
}
