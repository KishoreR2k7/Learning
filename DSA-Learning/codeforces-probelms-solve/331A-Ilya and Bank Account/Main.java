import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 0) {
            System.out.println(n);
        } else {
            int temp = n / 10;
            int lastdigit = n % 10;
            System.out.println(Math.max(temp, ((n / 100) * 10 + lastdigit)));
        }
    }
}