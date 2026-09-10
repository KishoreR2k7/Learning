import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int h = scan.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] > h) {
                count += 2;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}