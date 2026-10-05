import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int q = scan.nextInt();
        int[] diff = new int[200002];
        for (int i = 0; i < n; i++) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            diff[l]++;
            diff[r + 1]--;
        }
        int[] prefix = new int[200001];
        int count = 0;
        for (int i = 1; i <= 200000; i++) {
            count += diff[i];
            if (count >= k) {
                prefix[i] = 1;
            }
        }
        for (int i = 1; i <= 200000; i++) {
            prefix[i] += prefix[i - 1];
        }
        while (q-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(prefix[b] - prefix[a - 1]);
        }
    }
}