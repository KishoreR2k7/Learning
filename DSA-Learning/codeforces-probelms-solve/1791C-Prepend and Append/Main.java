import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-- > 0) {
            int m = scan.nextInt();
            String s = scan.next();
            int count = 0;
            for (int i = 0; i < m / 2; i++) {
                if (s.charAt(i) != s.charAt(m - i - 1)) {
                    count++;
                } else {
                    break;
                }
            }
            System.out.println(Math.abs(m - (2 * count)));
        }
    }
}