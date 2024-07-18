package day4;
import java.util.ArrayList;
//with repitions
public class PermutationsofaStringwithdistint {
    public static void main(String[] args) {
        String s = "abb";
        printPermutation(s, "");
    }

    public static void printPermutation(String str, String ans) {
        
        if (str.length() == 0) {
            System.out.println(ans+" ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            if (!ans.contains(String.valueOf(ch))) {
                printPermutation(ros, ans + ch);
            }
        }
        
    }
}

