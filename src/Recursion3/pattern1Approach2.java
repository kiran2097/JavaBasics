package Recursion3;

public class pattern1Approach2 {

    public static void main(String[] args) {
        f(36, 6);
    }
    private static void f(int n, int totalStars) {
        if(n<=0) return;
        if(n%totalStars==0)
            System.out.println();
        System.out.print("*");
        f(n-1, totalStars);
    }
}
