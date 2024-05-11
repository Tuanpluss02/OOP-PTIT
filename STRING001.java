import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.next();
            int i = sc.nextInt();
            System.out.println("The character at position " + i + " is " + s.charAt(i));
        }
        sc.close();
    }

}