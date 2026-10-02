import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k1 = scan.nextInt();
            int k2 = scan.nextInt();
            int w = scan.nextInt();
            int b = scan.nextInt();
            if (((k1 + k2) / 2 >= w) && (((n * 2) - (k1 + k2)) / 2 >= b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}