import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().toLowerCase();
            String c = sc.nextLine().toLowerCase();
            System.out.println(s.equals(c));
        }
        sc.close();
    }

}