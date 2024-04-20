package Strings;

public class subStrings {

    public static void main(String[] args) {

        printSubstrings("code");
    }

    private static void printSubstrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
