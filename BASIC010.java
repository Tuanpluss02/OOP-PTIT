import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test-- > 0) {
            int n = sc.nextInt();
            int res = 0, log = 1;
            while (n >= 10) {
                res += 10 * log * (n % 10);
                n /= 10;
                res += log * (n % 10);
                n /= 10;
                log *= 100;
            }
            System.out.println(res + log * n);
        }
        sc.close();
    }
}
