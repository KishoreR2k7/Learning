import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            String s = scan.next();
            char[] arr = s.toCharArray();
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] == '1' && arr[n - 1] == '0') {
                    int moves = n - 1 - i;
                    if (moves <= k) {
                        arr[i] = '0';
                        arr[n - 1] = '1';
                        k -= moves;
                    } else {
                        arr[i] = '0';
                        arr[i + k] = '1';
                        k = 0;
                    }
                    break;
                }
            }
            for (int i = 1; i < n; i++) {
                if (arr[i] == '1' && arr[0] == '0') {
                    int moves = i;
                    if (moves <= k) {
                        arr[i] = '0';
                        arr[0] = '1';
                        k -= moves;
                    } else {
                        arr[i] = '0';
                        arr[i - k] = '1';
                        k = 0;
                    }
                    break;
                }
            }
            long answer = 0;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == '1' && arr[i + 1] == '0') {
                    answer += 10;
                } else if (arr[i] == '0' && arr[i + 1] == '1') {
                    answer += 1;
                } else if (arr[i] == '1' && arr[i + 1] == '1') {
                    answer += 11;
                }
            }
            System.out.println(answer);
        }
    }
}