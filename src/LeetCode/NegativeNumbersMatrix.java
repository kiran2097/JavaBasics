package LeetCode;

public class NegativeNumbersMatrix {

    // https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
    // Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
    // Output: 8

    public static void main(String[] args) {

        int[][] matrix = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int count = countNegatives(matrix);
        System.out.println(count);
    }

    private static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {

            for (int j = grid[0].length - 1; j >= 0; j--) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
