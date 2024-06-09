package RecusionAssignment;

public class CharactersInParenthesis {
    // Assignment recursion 2 question 6
    // Take a string as an input. Write a recursive function that returns contents between the parenthesis.
    // Example: xyz(abc)def
    public static void main(String[] args) {
        String str = "xyz(abc)def";
        StringBuilder output = new StringBuilder();
        int idx = 0;
        System.out.println(charactersInParenthesis(str, idx, output, 0));
    }

    private static StringBuilder charactersInParenthesis(String str, int idx, StringBuilder output, int flag) {
        if(str.charAt(idx) == ')' || idx == str.length() - 1 ) return output;
        if(str.charAt(idx) == '(') return charactersInParenthesis(str, idx + 1, output, 1);
        if(flag == 1) return charactersInParenthesis(str, idx + 1, output.append(str.charAt(idx)), 1);
        return charactersInParenthesis(str, idx+1, output, 0);
    }
}
