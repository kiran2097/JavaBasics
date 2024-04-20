package practice;

public class patternHW7 {

    public static void main(String[] args) {
        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1
        // 1 5 10 10 5 1

        int n = 7;
        int[][] arr = new int[n][];
        System.out.println(1);
        for (int i = 1; i < n; i++) {
            arr[i] = new int[i + 1];
            arr[i][0] = 1;
            arr[i][arr[i].length - 1] = 1;
            for (int j = 1; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i-1][j - 1];
            }
            for(int data: arr[i]) {
                System.out.print(data + " ");
            }
            System.out.println();

        }
        }
}

