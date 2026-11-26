import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextLong();
            }
            if (arr[0] + arr[1] <= arr[n - 1]) {
                System.out.println("1 2 " + n);
            } else {
                System.out.println(-1);
            }
        }
    }
}