package LeetCode;

import java.util.ArrayList;

public class PeakElements {

    public static void main(String[] args) {
//2951
        int[] arr = {1,4,3,8,5};
        ArrayList<Integer> peaks = findPeaks(arr);
        int[] result = new int[peaks.size()];
        int i = 0;
        for (Integer ele: peaks) {
            result[i] = ele;
            i++;
        }
    }

    private static ArrayList<Integer> findPeaks(int[] arr) {
        ArrayList<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                peaks.add(i);
        }
        return peaks;
    }
}
