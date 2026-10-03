import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            StringBuilder sb = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == '0') {
                    String temp = s.substring(i - 2, i);
                    sb.insert(0, (char) ('a' + Integer.parseInt(temp) - 1));
                    i -= 2;
                } else {
                    int num = s.charAt(i) - '0';
                    sb.insert(0, (char) ('a' + num - 1));
                }
            }
            System.out.println(sb.toString());
        }
    }
}