import java.util.ArrayList;

public class Lexi {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        count(100, 1, al);
        for (String s : al) {
            System.out.println(s);
        }
    }

    public static void count(int n, int curr, ArrayList<String> al) {
        if (curr > n) {
            return;
        }

        al.add(String.valueOf(curr));
        for (int i = 0; i < 10; i++) {
            count(n, curr * 10 + i, al);
        }
    }
}