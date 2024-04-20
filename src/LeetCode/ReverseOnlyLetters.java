package LeetCode;

public class ReverseOnlyLetters {

//    https://leetcode.com/problems/reverse-only-letters/description/

    public static void main(String[] args) {
        String s = "Test1ng-Leet=code-Q!";
         s = ";1yDV";
        System.out.println(reverseLettersOnly(s));
    }

    private static String reverseLettersOnly(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = s.length() - 1;
        while (i < s.length()) {
            while(j>=0 && !Character.isLetter(s.charAt(j))) {
                j--;
            }
            if(j>=0 && Character.isLetter(s.charAt(i))) {
                System.out.println(s.charAt(i) + " ------ " + s.charAt(j));
                sb.append(s.charAt(j));
                j--;
            } else
                sb.append(s.charAt(i));
            i++;
        }
        return sb.toString();
    }
}
