package LeetCode;

public class GenerateParatheses {

//    https://leetcode.com/problems/generate-parentheses/

    //Recursion problem
    public static void main(String[] args) {
        f(3, 0, 0, "");
    }
    private static void f(int n, int o, int c, String output) {
        if(c==n) {
            System.out.println(output);
            return;
        }
        if (c < o) {
//            f(n, o+1, c, output + "(");
            f(n, o, c+1, output + ")");
        }
        if (o<n) {
            f(n, o+1, c, output + "(");
        }
    }
}
