import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            while (n % 2 == 0) {
                n = n / 2;
            }
            if (n > 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}