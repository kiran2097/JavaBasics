package RecusionAssignment;

import java.util.ArrayList;
import java.util.List;

public class IndicesArray {

    // Take N sized array, take an input 'm'.
    // Write a recursive function that returns an array containing indices of m in array

    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 9, 6, 17, 19, 78, 6, 56, 43, 23};
        int m = 6;
        List<Integer> indicesArray = new ArrayList<>();
        System.out.println(f(arr, 0, indicesArray, m));
    }

    private static List<Integer> f(int[] arr, int idx, List<Integer> indicesArray, int m) {
        if(idx == arr.length) return indicesArray;
        if(arr[idx] == m)
            indicesArray.add(idx);
        return f(arr, idx + 1, indicesArray, m);
    }
}
