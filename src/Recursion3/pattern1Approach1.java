package Recursion3;

public class pattern1Approach1 {
    // ****
    // ****
    // ****
    // ****
    public static void main(String[] args) {
        f(5, 5);
    }

    public static void f(int n, int totalStars) {
        if (n==0) return;
        g(totalStars);
        System.out.println();
        f(n-1, totalStars);
    }

    private static void g(int totalStars) {
        if(totalStars <=0) return;
        System.out.print("*");
        g(totalStars - 1);
    }
}
