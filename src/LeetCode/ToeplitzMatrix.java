package LeetCode;

public class ToeplitzMatrix {
    // 766
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}};
        boolean isToeplitz = checkToeplitzMatrix(matrix);
    }
    private static boolean checkToeplitzMatrix(int[][] matrix) {
        int remaining_rows;
        boolean flag = true;
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                int ele = matrix[i][j];
                remaining_rows = matrix.length - i - 1;
                for(int k = 1; k <= remaining_rows; k++) {
                    if (i+k < matrix.length && j+k < matrix[0].length) {
                        if (ele != matrix[i+k][j+k])
                        {
                            flag = false;
                            return flag;
                        }
                    }
                }
            }
        }
        return flag;
    }
}
