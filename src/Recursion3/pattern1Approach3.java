package Recursion3;

public class pattern1Approach3 {
    public static void main(String[] args) {
        f(1, 1, 3);
    }

    private static void f(int row, int col, int n) {
        if (row > n) return;
        if (col > n)
        { System.out.println();
            f (row + 1, 1, n);
            return;
        }
        System.out.print("*");
        f(row, col + 1, n);
    }
}
