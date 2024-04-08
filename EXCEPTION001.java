import java.util.Scanner;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount other) throws CurrencyMismatchException {
        if (!this.currency.equals(other.currency)) {
            throw new CurrencyMismatchException("Currency doesn't match");
        }
        this.amount += other.amount;
    }
public int getAmount() {
        return amount;
    }

}

class CurrencyMismatchException extends Exception {
    public CurrencyMismatchException(String message) {
        super(message);
    }
}

public class EXCEPTION001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String currency1 = sc.next();
            int amount1 = sc.nextInt();
            String currency2 = sc.next();
            int amount2 = sc.nextInt();
            try {
                Amount amount1Obj = new Amount(currency1, amount1);
                Amount amount2Obj = new Amount(currency2, amount2);
                amount1Obj.add(amount2Obj);
                System.out.println(amount1Obj.getAmount());
            } catch (CurrencyMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
}