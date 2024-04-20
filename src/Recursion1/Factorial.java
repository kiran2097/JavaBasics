package Recursion1;

public class Factorial {

    public static int f(int n) {
        // Base case
        if (n == 1) return 1;
        int assumption = f(n-1);
        return n * assumption;
    }

    public static void main(String[] args) {

        System.out.println(f(5));
    }
}
