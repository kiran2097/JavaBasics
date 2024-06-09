package RecusionAssignment;

public class PalindromeString {

    public static void main(String[] args) {
        System.out.println(f("abaaba", 0));
    }

    public static boolean f(String str, int idx) {
        if(idx == str.length()/2) return true;
        return (str.charAt(idx) == str.charAt(str.length() - 1 -idx)) & f(str, idx + 1);
    }
}
