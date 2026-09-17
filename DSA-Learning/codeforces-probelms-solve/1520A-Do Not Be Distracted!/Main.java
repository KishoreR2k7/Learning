import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            boolean[] seen = new boolean[26];
            boolean possible = true;
            for (int i = 0; i < n; i++) {
                char current = s.charAt(i);
                if (i == 0 || current != s.charAt(i - 1)) {
                    if (seen[current - 'A']) {
                        possible = false;
                        break;
                    }
                    seen[current - 'A'] = true;
                }
            }
            if (possible)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}