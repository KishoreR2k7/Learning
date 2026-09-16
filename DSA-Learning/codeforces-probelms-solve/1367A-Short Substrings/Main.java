import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        int n = scan.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scan.next();
        }
        for (String a : s) {
            if (a.length() == 2) {
                System.out.println(a);
            } else {
                String b = "";
                for (int i = 1; i < a.length(); i = i + 2) {
                    b += a.charAt(i);
                }
                System.out.println(a.charAt(0) + b);
            }
        }
    }
}