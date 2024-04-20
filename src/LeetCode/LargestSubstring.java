package LeetCode;

public class LargestSubstring {
//    https://leetcode.com/problems/largest-substring-between-two-equal-characters/description/

    public static void main(String[] args) {
//        System.out.println(largestSubstringBetweenTwoEqualCharacters("cabbac"));
        String str = "mgntdygtxrvxjnwksqhxuxtrv";
        int maxSubstring = secondApproach(str);
        System.out.println(maxSubstring);
    }

    private static int secondApproach(String str) {
        int[] index = new int[26];
        int length, max = -1;
        for(int i = 0;i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (index[currentChar - 97] != 0) {
                length = i - index[currentChar - 97];
                if (length > max) {
                    max = length;
                    System.out.println(currentChar);
                }
            }
            else
            index[currentChar - 97] = i + 1;
        } return max;
    }

    private static int largestSubstringBetweenTwoEqualCharacters(String str) {
        int i = 0, j = str.length() - 1, len = -1;
        int max = Integer.MIN_VALUE;
        for (i = 0; i < str.length(); i++) {
            for (int k = j; k > i; k--) {
                if (str.charAt(i) == str.charAt(k))
                {
                    len = k - i - 1;

                    if (len > max)
                    {max = len;
                        System.out.println(len + " ---- " + max);}
                }
            }
        }
        return len;
    }
}
