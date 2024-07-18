package day4;
import java.util.List;
import java.util.ArrayList;

public class LetterCombinationforPhone {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        lettercombo("23", "", list);
        for(String s : list){
            System.out.println(s);
        }
    }

    static final String[] codes = {"",    "",    "abc",  "def", "ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void lettercombo(String str, String ans,  List<String> list) {
        if (str.length() == 0) {
            list.add(ans);
            return;
        }

        char ch = str.charAt(0);
        int n = ch-'0';

        for(int i=0 ; i<codes[n].length() ; i++){
            char ch1 = codes[n].charAt(i);
            lettercombo(str.substring(1), ans+ch1, list);
        }


    }

}
