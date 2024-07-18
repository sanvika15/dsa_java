public class CoinToss2 {
    public static void main(String[] args) {
        int n = 3;
       cointoss(n, "");
    }

    private static void cointoss(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        if(ans.length()>0 && ans.charAt(ans.length()-1) != 'H'){
        cointoss(n-1, ans+"H");
        }
        cointoss(n-1, ans+"T");

    }
}
