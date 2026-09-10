import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                count++;
            }
        }
        if (count > s.length() / 2) {
            System.out.println("Anton");
        } else if (count < n - count) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}