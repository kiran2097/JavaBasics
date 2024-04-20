package Strings;

public class replaceASCII {
    public static void main(String[] args) {

        System.out.println(replaceEachWordAscii("cdEfG"));
    }

    private static String replaceEachWordAscii(String str) {
        char ch;
        StringBuilder st = new StringBuilder(str);
        for (int i = 0; i < st.length(); i++) {
            ch = st.charAt(i);
            if (i % 2 == 0) {
                ch = (char)(ch + 1);
            } else {
                ch = (char)(ch - 1);
            } st.setCharAt(i, ch);
        } return st.toString();
    }
}
