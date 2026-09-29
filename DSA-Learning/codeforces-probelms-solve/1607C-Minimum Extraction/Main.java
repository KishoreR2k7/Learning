import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
            int ans = arr[0];
            for (int i = 1; i < n; i++) {
                ans = Math.max(ans, arr[i] - arr[i - 1]);
            }
            System.out.println(ans);
        }
    }
}