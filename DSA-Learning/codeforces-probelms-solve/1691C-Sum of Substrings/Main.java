import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNextInt()) return;
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            char[] s = scan.next().toCharArray();
            int first = -1;
            int last = -1;            
            for (int i = 0; i < n; i++) {
                if (s[i] == '1') {
                    if (first == -1) first = i;
                    last = i;
                }
            }
            if (first == -1) {
                System.out.println(0);
                continue;
            }
            if (first == last) {
                int costToLast = n - 1 - last;
                int costToFirst = first;                
                if (costToLast <= k) {
                    s[last] = '0';
                    s[n - 1] = '1';
                } else if (costToFirst <= k) {
                    s[first] = '0';
                    s[0] = '1';
                }
            } 
            else {
                int costToLast = n - 1 - last;
                if (costToLast <= k) {
                    k -= costToLast;
                    s[last] = '0';
                    s[n - 1] = '1';
                }                
                int costToFirst = first;
                if (costToFirst <= k) {
                    s[first] = '0';
                    s[0] = '1';
                }
            }
                        int ans = 0;
            for (int i = 0; i < n - 1; i++) {
                if (s[i] == '1') ans += 10;
                if (s[i + 1] == '1') ans += 1;
            }
            System.out.println(ans);
        }
    }
}
