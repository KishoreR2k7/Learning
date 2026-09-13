import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scan.next();
        }
        for (String a : s) {
            if ((a.toLowerCase()).equals("yes")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}