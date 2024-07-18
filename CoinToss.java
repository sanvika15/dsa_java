public class CoinToss {
    public static void main(String[] args) {
        int n = 3;
       cointoss(n, "");
    }

    private static void cointoss(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        cointoss(n-1, ans+"H");
        cointoss(n-1, ans+"T");

    }
}
