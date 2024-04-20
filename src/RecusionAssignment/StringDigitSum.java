package RecusionAssignment;

public class StringDigitSum {

    public static void main(String[] args) {

        String str = "5831";
        System.out.println(f(str, 0));
    }

    private static int f(String str, int idx) {
        if (idx == str.length() - 1 ) return Character.getNumericValue(str.charAt(idx));
        return Character.getNumericValue(str.charAt(idx)) + f(str, idx + 1);
    }
}
