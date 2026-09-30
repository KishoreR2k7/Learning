import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            boolean[] used = new boolean[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();

                if (a[i] <= n) {
                    used[a[i]] = true;
                }
            }
            for (int i = 0; i <= n; i++) {

                if (used[i]) {
                    System.out.print(i + " ");
                }
            }
            boolean[] printed = new boolean[n + 1];
            for (int i = 0; i < n; i++) {
                int x = a[i];
                if (x <= n) {
                    if (!printed[x]) {
                        printed[x] = true;
                    } else {
                        System.out.print(x + " ");
                    }
                } else {
                    System.out.print(x + " ");
                }
            }
            System.out.println();
        }
    }
}