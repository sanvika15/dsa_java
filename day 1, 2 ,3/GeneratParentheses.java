import java.util.ArrayList;

public class GeneratParentheses {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        int n = 3; 
        GP(n, 0, 0, "", al);
        for (String s : al) {
            System.out.println(s);
        }
    }

    public static void GP(int n, int oc, int cc, String ans, ArrayList<String> al) {
        if (cc == n && oc == n) {
            al.add(ans);
            return;
        }
        if (oc > n || cc > n || cc > oc) {
            return;
        }

        GP(n, oc + 1, cc, ans + "(", al);
        GP(n, oc, cc + 1, ans + ")", al);
    }
}