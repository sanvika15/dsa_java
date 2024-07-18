import java.util.*;

class SubsequencesofString {

    public static void main(String[] args) {
        String s = "abc";
        findsubsequences(s, "");
    }

    private static void findsubsequences(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        findsubsequences(s.substring(1), ans);
        findsubsequences(s.substring(1), ans + s.charAt(0));

    }
}