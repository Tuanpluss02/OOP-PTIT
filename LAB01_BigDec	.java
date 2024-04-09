import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            BigDecimal sum = BigDecimal.ZERO;
            String[] numbers = sc.nextLine().split(" ");
            for (String number : numbers) {
                String[] parts = number.split("\\.");
                sum = sum.add(new BigDecimal(number).subtract(new BigDecimal(parts[0])));
            }
            System.out.println(sum);
        }
        sc.close();
    }
}