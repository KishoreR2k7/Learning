import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-- > 0) {
            int m = scan.nextInt();
            int x = scan.nextInt();
            int[] a = new int[m];
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = scan.nextInt();
                b[i] = scan.nextInt();
            }
            int c = 0;
            for (int i = 0; i < m; i++) {
                if (a[i] + b[m - 1 - i] > x) {
                    System.out.println("NO");
                    c++;
                    break;
                }
            }
            if (c == 0) {
                System.out.println("YES");
            }

        }
    }
}