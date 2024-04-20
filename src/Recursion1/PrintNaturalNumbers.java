package Recursion1;

public class PrintNaturalNumbers {

    // Given a number n, print first n natural numbers in decreasing order

    public static void f (int n) {
        if (n == 0) return;
            System.out.println(n);
            f(n-1);
    }

    public static void main(String[] args) {
        f(5);
    }
}
