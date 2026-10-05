import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] v = new int[n];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = scan.nextInt();
            arr[i] = v[i];
        }
        Arrays.sort(arr);
        long[] prefixV = new long[n + 1];
        long[] prefixArr = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefixV[i + 1] = prefixV[i] + v[i];
            prefixArr[i + 1] = prefixArr[i] + arr[i];
        }
        int m = scan.nextInt();
        while (m-- > 0) {
            int type = scan.nextInt();
            int l = scan.nextInt();
            int r = scan.nextInt();
            if (type == 1) {
                System.out.println(prefixV[r] - prefixV[l - 1]);
            } else {
                System.out.println(prefixArr[r] - prefixArr[l - 1]);
            }
        }
    }
}