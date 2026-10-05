import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int[] query = new int[m];
        for (int i = 0; i < m; i++) {
            query[i] = scan.nextInt();
        }
        int[] label = new int[n];
        label[0] = arr[0];
        int prev = arr[0];
        for (int i = 1; i < n; i++) {
            label[i] = prev + arr[i];
            prev = label[i];
        }
        for (int i = 0; i < m; i++) {
            int left = 0, rigth = n - 1;
            while (left < rigth) {
                int mid = (left + rigth) / 2;
                if (label[mid] >= query[i]) {
                    rigth = mid;
                } else {
                    left = mid + 1;
                }
            }
            System.out.println(left + 1);
        }
    }
}