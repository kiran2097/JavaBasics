package ArrayList;

import java.util.ArrayList;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        // WAP to find intersection of two sorted arrays
        // The below array should give [20, 30, 40]
        int[] arr1 = {10, 19, 20, 30, 40, 40, 40, 50};
        int[] arr2 = {15, 16, 18, 20, 22, 30, 30, 40};

        ArrayList<Integer> result = Intersection(arr1, arr2);
        System.out.println(result);
    }

    private static ArrayList<Integer> Intersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] > arr2[j]){
                j++;
            }
            else if(arr1[i] < arr2[j])
            {
                i++;
            }
            else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        return result;
    }
}
