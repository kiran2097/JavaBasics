package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class RankOfArray {
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        int[] rank = new int[arr.length];
        int min;
        int[] copy = arr.clone();
        int[] result = new int[arr.length];
        int rankOfEle = 1;
        ArrayList<Integer> dup = new ArrayList<>();
        Arrays.fill(rank, 1);
        for(int i = 0; i < copy.length - 1; i++)
        {
            min = i;
             for( int j = i + 1; j < copy.length; j++) {
                 if(copy[j] < copy[min]) {
                     min = j;
                 }
                 if (copy[j] == copy[min])
                 {
                     dup.add(j);
                 }
            }
             rank[i] = min;
             int temp = copy[min];
             copy[min] = copy[i];
             copy[i] = temp;
        }
        for(int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
        System.out.println();

//        for(int i = 0; i < rank.length; i++) {
//            if(dup.contains(rank[i])) {
//                result[rank[i]] = rankOfEle - 1;
//            }
//            else {
//                result[i] = rankOfEle;
//            }
//            rankOfEle++;
//        }
        for(int i = 0; i < rank.length; i++) {
            System.out.print(rank[i] + " ");
        }
        System.out.println();
    }
}
