import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            int res = 0;
            if (a > 0 && b > 0) {
                res = 1;
            } else if (a < 0 && b > 0) {
                res = 2;
            } else if (a < 0 && b < 0) {
                res = 3;
            } else if (a > 0 && b < 0) {
                res = 4;
            }
            System.out.println(res);
        }
        sc.close();
    }
}
