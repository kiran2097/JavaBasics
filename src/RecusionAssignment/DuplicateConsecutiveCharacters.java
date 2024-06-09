package RecusionAssignment;

public class DuplicateConsecutiveCharacters {

    //
    public static void main(String[] args) {
        String str = "hellloo";
        StringBuilder output = new StringBuilder();
        int idx = 0;
        System.out.println(SeparateDuplicateConsecutiveCharacters(str, idx, output));
    }

    private static StringBuilder SeparateDuplicateConsecutiveCharacters(String str, int idx, StringBuilder output) {
        if(idx == str.length() - 1) return output.append(str.charAt(idx));
        if(str.charAt(idx) == str.charAt(idx+1)) {
            output.append(str.charAt(idx)+"*");
            return SeparateDuplicateConsecutiveCharacters(str, idx + 1, output);
        } else {
            output.append(str.charAt(idx));
            return SeparateDuplicateConsecutiveCharacters(str, idx + 1, output);
        }
    }
}
