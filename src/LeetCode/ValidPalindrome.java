package LeetCode;

//import static LeetCode.LargestSubstring.secondApproach;

public class ValidPalindrome {

    // https://leetcode.com/problems/valid-palindrome/
    public static void main(String[] args) {
        String st = "A man, a plan, a canal: Panama";
        String s = "0p";
//        System.out.println(isValidPalindrome(s.toLowerCase()));
        System.out.println(secondApproach(s));
    }

    private static boolean secondApproach(String s) {
        for(int i = 0, j = s.length() - 1; i < j; i++, j--) {

            while (i<j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while (i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
            }
        return true;
    }

    private static boolean isValidPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if((ch>= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') )
            {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
        int i =0, j = sb.length() - 1;
        while(i < j) {
            if (sb.charAt(i) != sb.charAt(j)) {
                System.out.println(i);
                return false;
            }
            i++;
            j--;
        } return true;
    }
}
