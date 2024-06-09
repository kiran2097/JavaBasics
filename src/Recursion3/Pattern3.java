package Recursion3;

public class Pattern3 {
    // *****
    // ****
    // ***
    // **
    // *
    // rth row = n - row + 1

    public static void main(String[] args) {
        printpattern(1, 1, 5);
    }
    private static  void printpattern(int row, int col, int n) {
        if (row > n) return;
        if (col > n- row + 1 ) {
            System.out.println();
            printpattern(row + 1, 1, n);
            return;
        }
        System.out.print("*");
        printpattern(row, col + 1, n);
    }
}
