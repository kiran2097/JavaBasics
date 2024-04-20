package Matrix;

public class TransposeMatrix {

    public static void main(String[] args) {

        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };
        int[][] transposeMatrix = new int[arr[0].length][arr.length];
        for (int i = 0; i < transposeMatrix.length; i++) {
            for (int j = 0; j < transposeMatrix[0].length; j++) {
                    transposeMatrix[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < transposeMatrix.length; i++) {
            for (int j = 0; j < transposeMatrix[0].length; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
