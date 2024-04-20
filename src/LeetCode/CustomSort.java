package LeetCode;

public class CustomSort {
    // https://leetcode.com/problems/custom-sort-string/description/

    public static void main(String[] args) {
        String order = "cba", s = "abcd";
        System.out.println(customSortString(order, s));
    }

    private static String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[(int)(ch - 'a')] += 1;
        }
        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            int count = freq[(int)(ch - 'a')];
            freq[(int)(ch - 'a')] = 0;
            for (int j = 0; j < count; j++) {
                sb.append(ch);
            }
        } for(int i = 0; i < 26; i++) {
            for (int j = 0; j < freq[i]; j++) {
                sb.append((char)(i+97));
            }
        } return sb.toString();
    }
}
