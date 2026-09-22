import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-- > 0) {
            char c = scan.next().charAt(0);
            if ("codeforces".contains(String.valueOf(c))) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}