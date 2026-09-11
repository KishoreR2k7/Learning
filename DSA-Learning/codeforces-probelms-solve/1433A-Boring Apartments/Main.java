import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int digit = arr[i] % 10;
            int length = String.valueOf(arr[i]).length();
            System.out.println(((digit - 1) * 10) + (length * (length + 1) / 2));
        }
    }
}