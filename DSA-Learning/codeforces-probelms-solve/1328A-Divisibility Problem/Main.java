import java.util.*;

public class Main {
    public static void main(String[] aStrings) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a % b == 0) {
                arr[i] = 0;
            } else {
                arr[i] = ((((a / b) + 1) * b) - a);
            }
        }
        for (int num : arr) {
            System.out.println(num);
        }
    }
}