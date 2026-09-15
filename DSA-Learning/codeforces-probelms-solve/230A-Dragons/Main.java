import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int n = scan.nextInt();
        int[][] dragons = new int[n][2];
        for (int i = 0; i < n; i++) {
            dragons[i][0] = scan.nextInt();
            dragons[i][1] = scan.nextInt();
        }
        Arrays.sort(dragons, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < n; i++) {
            if (s <= dragons[i][0]) {
                System.out.println("NO");
                return;
            }
            s += dragons[i][1];
        }
        System.out.println("YES");
    }
}