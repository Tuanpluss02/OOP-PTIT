import java.util.Scanner;

public class Main {
    static boolean isLeapYear(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        if (year % 4 == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            System.out.println(n + " : " + (isLeapYear(n) ? "Leap-year" : "Non Leap-year"));
        }
    }
}
