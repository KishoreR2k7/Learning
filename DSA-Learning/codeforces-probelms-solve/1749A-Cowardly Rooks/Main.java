import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            for (int i = 0; i < k; i++) {
                scan.nextInt();
                scan.nextInt();
            }
            if (k < n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}