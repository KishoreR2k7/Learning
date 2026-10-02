import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] start = new int[n];
            int[] end = new int[n];
            for (int i = 0; i < n; i++) {
                start[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                end[i] = scan.nextInt();
            }
            int firststart = start[0];
            int firstend = end[0];
            int[] arr = new int[n];
            arr[0] = firstend - firststart;
            for (int i = 1; i < n; i++) {
                if (firstend < start[i]) {
                    arr[i] = end[i] - start[i];
                } else {
                    arr[i] = end[i] - firstend;
                }
                firstend = end[i];
            }
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.print("\n");
        }

    }
}