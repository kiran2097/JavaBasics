package LeetCode;

//import static LeetCode.LargestSubstring.secondApproach;

import java.util.Arrays;

public class ReverseWords {
    // https://leetcode.com/problems/reverse-words-in-a-string/description/

    public static void main(String[] args) {
        String s = "the sky is   blue   ";
//        System.out.println(reverseWordsInString(s));
        System.out.println(secondApproach(s));
    }

    private static String reverseWordsInString(String s) {
        StringBuilder sb = new StringBuilder();
        s = " " + s + " ";
        int indexOfLetter = 1, indexOfSpace;
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            char chr = s.charAt(i+1);
            if (ch == ' ' && chr != ' ')
                indexOfLetter = i + 1;
            else if (ch != ' ' && chr == ' ') {
                indexOfSpace = i + 1;
                sb.insert(0, s.substring(indexOfLetter, indexOfSpace));
                sb.insert(0, " ");
            }
        }
        System.out.println(sb);
        sb.trimToSize();
        return sb.toString().trim();
    }
    private  static String secondApproach(String s) {
        String[] stringArr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String st: stringArr) {
            sb.insert(0, st);
            sb.insert(0, " ");
        }
//        System.out.println(" " + Arrays.toString(stringArr));
        return sb.toString().trim();
    }
}
