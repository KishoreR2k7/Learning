import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int current = 0;
        for (int i = 0; i < n; i++) {
            current = (current - a[i]) + b[i];
            max = Math.max(current, max);
        }
        System.out.println(max);
    }
}