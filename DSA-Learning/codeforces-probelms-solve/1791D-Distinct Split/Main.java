import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int[] left = new int[26];
            int[] right = new int[26];
            for (char c : s.toCharArray()) {
                right[c - 'a']++;
            }
            int leftDistinct = 0;
            int rightDistinct = 0;
            for (int i = 0; i < 26; i++) {
                if (right[i] > 0) {
                    rightDistinct++;
                }
            }
            int ans = 0;
            for (int i = 0; i < n - 1; i++) {
                int index = s.charAt(i) - 'a';
                if (left[index] == 0) {
                    leftDistinct++;
                }
                left[index]++;
                right[index]--;
                if (right[index] == 0) {
                    rightDistinct--;
                }
                ans = Math.max(ans, leftDistinct + rightDistinct);
            }
            System.out.println(ans);
        }
    }
}