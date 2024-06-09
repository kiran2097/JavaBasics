package Recursion5;

public class FrogAndStone {

//    public static int[] height = {10, 30, 40, 20};
//    public static int[] height = {10, 10};
    public static int[] height = {30, 10, 60, 10, 60, 50};
    public static void main(String[] args) {
        int n = height.length, i =0;
        System.out.println(f(n, i, 0));
    }

    private  static int f(int n, int i, int cost) {
        if ( i >= n-1) return cost;
        if( i + 1 <= n-1 && i + 2 == n)
            return f(n, i + 1, (cost + Math.abs(height[i] - height[i+1])));
        return Math.min(f(n, i + 1, (cost + Math.abs(height[i] - height[i+1]))), f(n, i+2, (cost + Math.abs(height[i] - height[i+2])))) ;
    }
}
