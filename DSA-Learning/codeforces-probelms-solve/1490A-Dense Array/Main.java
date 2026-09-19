import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-- > 0) {
            int m = scan.nextInt();
            int[] arr = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = scan.nextInt();
            }
            int answer = 0;
            for (int i = 0; i < m - 1; i++) {
                int small = Math.min(arr[i], arr[i + 1]);
                int big = Math.max(arr[i], arr[i + 1]);
                while (small * 2 < big) {
                    small *= 2;
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }
}