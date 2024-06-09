package Recursion3;

public class PrintStringWithoutOccurence {

    // Given a string 'S', print the new String without any occurence of 'x'
    // Example - abcxxadxacxe       Ans - abcadace
    public static void main(String[] args) {
        String str = "abcxxadxacxe";
        System.out.println(f(str, "", 0));
    }

    private static String f(String str, String newStr, int idx) {
        if (idx >= str.length()) return newStr;
        if(str.charAt(idx) != 'x') {
            return f(str, newStr + str.charAt(idx), idx + 1);
        }
        return f(str, newStr, idx + 1);
    }
}
