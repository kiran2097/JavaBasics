package LeetCode;

public class SplitTwoStrings {

    // https://leetcode.com/problems/split-two-strings-to-make-palindrome/

    public static void main(String[] args) {

//        String a = "xbdef", b = "xecab";
        String a = "ulacfd", b = "jizalu";
        System.out.println(checkPalindromeFormation(a, b));
    }

    private static boolean checkPalindromeFormation(String a, String b) {


        for (int i = 0; i < a.length(); i++) {
            StringBuilder sb = new StringBuilder();
            String a_pre = a.substring(0, i);
            String a_suf = a.substring(i);
            String b_pre = b.substring(0, i);
            String b_suf = b.substring(i);
            sb.append(a_pre).append(b_suf);
            boolean first = isPalindrome(sb.toString());
            if (first) {
                return true;
            }
            System.out.println(sb.toString());
            sb.setLength(0);
            sb.append(b_pre).append(a_suf);
            boolean second  = isPalindrome(sb.toString());
            if (second) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if(s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;
        } return true;
    }


}
