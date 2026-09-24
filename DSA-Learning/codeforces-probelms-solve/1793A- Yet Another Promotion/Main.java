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
            for (long k = Math.max(0, groups - 2); k <= groups + 2; k++) {
                long day1Paid = k * m;
                long day1Got = k * (m + 1);
                long remaining = Math.max(0, n - day1Got);
                long cost = day1Paid * a + remaining * b;
                ans = Math.min(ans, cost);
                long costAllDay1 = (day1Paid + remaining) * a;
                ans = Math.min(ans, costAllDay1);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}