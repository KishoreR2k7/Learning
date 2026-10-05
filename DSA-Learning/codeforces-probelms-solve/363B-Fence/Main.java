import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int min = 0, sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        min = sum;
        int index = 1;
        for (int i = k; i < n; i++) {
            sum -= arr[i - k];
            sum += arr[i];
            index = min > sum ? i - k + 2 : index;
            min = Math.min(min, sum);
        }
        System.out.println(index);
    }
}