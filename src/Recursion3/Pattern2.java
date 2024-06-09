package Recursion3;

public class Pattern2 {

    public static void main(String[] args) {
        // *
        // **
        // ***
        // ****
        // *****

        printPatttern(1, 1, 5);
    }
    private static void printPatttern(int row, int col, int n) {
        if(row > n) return;
        if (col > row) {
            System.out.println();
            printPatttern(row + 1, 1, n);
            return;
        }
        System.out.print("*");
        printPatttern(row, col + 1, n);
    }
}
