package RecusionAssignment;

public class StringToInteger {

    public static void main(String[] args) {

        System.out.println(f("1234", 0));
    }

    public static int f(String str, int idx) {
        if(idx == str.length() - 1) return Character.getNumericValue(str.charAt(idx));
        double v = (Character.getNumericValue(str.charAt(idx)) * Math.pow(10, (str.length() - idx - 1))) ;
        return (int)v + f(str, idx + 1);
    }
}
