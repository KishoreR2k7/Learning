import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            boolean possible = true;
            for (int i = 0; i < n;) {
                int j = i;
                while (j < n && a[j] == a[i]) {
                    j++;
                }
                if (j - i == 1) {
                    possible = false;
                    break;
                }
                i = j;
            }
            if (!possible) {
                System.out.println(-1);
                continue;
            }
            int[] ans = new int[n];
            for (int i = 0; i < n;) {
                int j = i;
                while (j < n && a[j] == a[i]) {
                    j++;
                }
                for (int k = i; k < j - 1; k++) {
                    ans[k] = k + 2;
                }
                ans[j - 1] = i + 1;
                i = j;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}