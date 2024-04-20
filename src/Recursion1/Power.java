package Recursion1;

public class Power {
    // a^b

    public static int f(int a, int b) {
        if (b == 0) return 1;
        int assumption = f(a, b-1);
        return a * assumption;
    }

    public static void main(String[] args) {
        System.out.println(f(3, 5));
    }
}
