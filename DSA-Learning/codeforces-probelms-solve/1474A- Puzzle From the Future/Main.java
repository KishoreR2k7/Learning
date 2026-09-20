import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String b = sc.next();
            StringBuilder a = new StringBuilder();
            a.append('1');
            int previous = b.charAt(0) - '0' + 1;
            for (int i = 1; i < n; i++) {
                int currentB = b.charAt(i) - '0';
                int c;
                if (previous == currentB + 1) {
                    c = currentB;
                } else {
                    c = currentB + 1;
                }
                int currentA = c - currentB;
                a.append(currentA);
                previous = c;
            }
            System.out.println(a);
        }
        sc.close();
    }
}