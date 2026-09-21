import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            int[] b = new int[2 * n];
            int left = 0;
            int right = n;
            for (int i = 0; i < 2 * n; i++) {

                if (i % 2 == 0) {
                    b[i] = a[left];
                    left++;
                } else {
                    b[i] = a[right];
                    right++;
                }
            }
            for (int i = 0; i < 2 * n; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}