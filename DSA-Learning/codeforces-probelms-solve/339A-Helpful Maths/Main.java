import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        boolean first = true;
        for (char ch : arr) {
            if (ch == '+') {
                continue;
            }
            if (!first) {
                System.out.print("+");
            }
            System.out.print(ch);
            first = false;
        }
    }
}