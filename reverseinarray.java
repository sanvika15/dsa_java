
public class reverseinarray {
    static void reverse(int a[], int n) {
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }

    static void printarr(int a[], int n) {
        for (int k = 0; k < n; k++) {
            System.out.println(a[k]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        reverse(arr, n);
        printarr(arr, n);
    }
}