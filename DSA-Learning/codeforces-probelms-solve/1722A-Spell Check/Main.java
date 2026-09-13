import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String[] ans = new String[t];
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            String s = scan.next();
            char[] arr = s.toCharArray();
            char[] target = "Timur".toCharArray();
            Arrays.sort(arr);
            Arrays.sort(target);
            if (Arrays.equals(arr, target)) {
                ans[i] = "YES";
            } else {
                ans[i] = "NO";
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
        scan.close();
    }
}