import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int minPos = 0;
            int maxPos = 0;
            for (int i = 0; i < n; i++) {
                int x = scan.nextInt();
                if (x < min) {
                    min = x;
                    minPos = i;
                }
                if (x > max) {
                    max = x;
                    maxPos = i;
                }
            }
            int left = Math.max(minPos, maxPos) + 1;
            int right = n - Math.min(minPos, maxPos);
            int both = Math.min(minPos, maxPos) + 1 + n - Math.max(minPos, maxPos);
            int answer = Math.min(left, Math.min(right, both));
            System.out.println(answer);
        }
    }
}