package Recursion4;

public class Subsequence {

    //Print all subsequences of abc
    public static void main(String[] args) {
        String str = "abc";
        int idx = 0;
        generateSubsequence(str, idx, "");
    }

    private static void generateSubsequence(String str, int idx, String output) {
        if(idx == str.length()) {
            System.out.println(output);
            return;
        }
        generateSubsequence(str, idx + 1, output + str.charAt(idx));
        generateSubsequence(str, idx + 1, output);
    }
}
