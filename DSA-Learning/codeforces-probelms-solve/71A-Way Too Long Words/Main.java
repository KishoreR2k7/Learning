import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scan.next();
        }
        for (int i = 0; i < n; i++) {
            if (s[i].length() > 10) {
                s[i] = s[i].charAt(0) + Integer.toString(s[i].length() - 2) + s[i].charAt(s[i].length() - 1);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}