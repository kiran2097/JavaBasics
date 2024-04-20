package Recursion1;

public class IncreasingNaturalNumbers {

        // Given a number n, print first n natural numbers in increasing order

        public static void f (int n) {
            if (n == 0) return;
            f(n-1);
            System.out.println(n);
        }

        public static void main(String[] args) {
            f(5);
        }
}
