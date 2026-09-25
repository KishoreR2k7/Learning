import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String a = scan.next();
            String b = scan.next();
            int sizea;
            int sizeb;
            if (a.charAt(a.length() - 1) == 'S') {
                sizea = -a.length();
            } 
            else if (a.charAt(a.length() - 1) == 'M') {
                sizea = 0;
            } 
            else {
                sizea = a.length();
            }
            if (b.charAt(b.length() - 1) == 'S') {
                sizeb = -b.length();
            } 
            else if (b.charAt(b.length() - 1) == 'M') {
                sizeb = 0;
            } 
            else {
                sizeb = b.length();
            }
            if (sizea > sizeb) {
                System.out.println(">");
            } 
            else if (sizea < sizeb) {
                System.out.println("<");
            } 
            else {
                System.out.println("=");
            }
        }
    }
}