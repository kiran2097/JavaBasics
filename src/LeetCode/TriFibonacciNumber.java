package LeetCode;

public class TriFibonacciNumber {
    // https://leetcode.com/problems/n-th-tribonacci-number/description/

    public static int fibonacci (int n) {
        if (n == 1 || n == 2) return 1;
        if (n== 0) return 0;
        return fibonacci(n-1) + fibonacci(n-2) + fibonacci(n-3);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(25));
    }
}
