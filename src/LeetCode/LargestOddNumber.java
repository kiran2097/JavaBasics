package LeetCode;

public class LargestOddNumber {
    // https://leetcode.com/problems/largest-odd-number-in-string/description/

    public static void main(String[] args) {

        String st = "52";
        String s = "7653687";
        System.out.println(largestOddNumberInTheString(s));
    }

    private static String largestOddNumberInTheString(String s) {
        int index = -1;
        for(int j = s.length()-1; j>=0; j--)
        {
            if(Character.getNumericValue(s.charAt(j)) %2 ==1){
                index = j;
                break;
            }
        } if(index == -1)
            return "";
        return s.substring(0, index + 1);
    }
}
