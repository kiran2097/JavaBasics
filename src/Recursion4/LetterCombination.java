package Recursion4;

public class LetterCombination {

    public static void main(String[] args) {
        telephoneLetterCombination("23", 0, "");
    }

    private static void telephoneLetterCombination(String str, int idx, String output) {
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(idx == str.length()) {
            System.out.println(output);
            return;
        } char digit = str.charAt(idx);
        for(int k=0; k< mapping[Character.getNumericValue(digit)].length(); k++) {
            telephoneLetterCombination(str, idx + 1, output + mapping[Character.getNumericValue(digit)].charAt(k));
        }
    }
}
