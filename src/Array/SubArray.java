package Array;

import java.util.*;

public class SubArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        // {}, {1}, {2}, {3}, {4}, {1, 2}, {2, 3}, {3, 4}, {1, 2, 3}, {2, 3, 4}, {1, 2, 3, 4}
        int len = arr.length;
        int window = len;
        List<ArrayList<Integer>> subArray= new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int j;

        int current_window;
        while(window > 0)
        {

            for (int i = 0; i < len; i++) {
                {
                    current_window = window;
                    for(j = 0; j <= current_window; j++ )
                    {
                        temp.add(arr[j]);
                    }
                    j++;
                    current_window++;

                }
            }
        }
    }
}
