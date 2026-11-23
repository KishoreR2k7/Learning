import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long sum = 0;
            int negativeCount = 0;
            long minAbs = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                long num = scan.nextLong();
                if (num < 0) {
                    negativeCount++;
                }
                long abs = Math.abs(num);
                sum += abs;
                minAbs = Math.min(minAbs, abs);
            }
            if (negativeCount % 2 != 0) {
                sum -= 2 * minAbs;
            }
            System.out.println(sum);
        }
        scan.close();
    }
}