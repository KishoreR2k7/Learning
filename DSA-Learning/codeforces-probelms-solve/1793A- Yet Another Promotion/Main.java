import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();
            long m = sc.nextLong();
            long ans = n * b;
            long groups = n / (m + 1);
            long promotionCost = m * a;
            long normalCost = (m + 1) * b;
            if (promotionCost < normalCost) {
                long remaining = n % (m + 1);
                long cost = groups * promotionCost;
                cost += remaining * Math.min(a, b);
                ans = Math.min(ans, cost);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}