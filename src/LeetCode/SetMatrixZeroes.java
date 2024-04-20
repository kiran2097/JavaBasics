package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {
//    https://leetcode.com/problems/set-matrix-zeroes/description/
    public static void main(String[] args) {

        int[][] matrix1 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        convertMatrix(matrix1);
        for (int[] row: matrix1) {
            for (int ele: row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }

    private static void convertMatrix(int[][] matrix) {
        Set<Integer> iList = new HashSet<>();
        Set<Integer> jList = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
              if (matrix[i][j] == 0) {
                  iList.add(i);
                  jList.add(j);
              }
            }
        }
        for (Integer ele: iList) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[ele][col] = 0;
            }
        }
        for (Integer ele: jList) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][ele] = 0;
            }
        }
    }
}
