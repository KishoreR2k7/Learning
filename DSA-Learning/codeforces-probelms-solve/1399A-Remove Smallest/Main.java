import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[n];
        for (int t = 0; t < n; t++) {
            int m = scan.nextInt();
            int[] a = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            boolean c = true;
            for (int i = 0; i < m - 1; i++) {
                if (a[i + 1] - a[i] > 1) {
                    c = false;
                    break;
                }
            }
            if (c) {
                arr[t] = "YES";
            } else {
                arr[t] = "NO";
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}