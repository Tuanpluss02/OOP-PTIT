class BankAccount {
    // TODO: Khởi tạo id (String), balance (double) và transactions (int) để đếm số
    // lượng giao dịch
    private String id;
    private double balance;
    private int transactions;

    // TODO: Xây dựng constructor with the given id, and 0 balance and transactions
    public BankAccount(String id) {
        this.id = id;
        this.balance = 0.0;
        this.transactions = 0;
    }

    // TODO: Sử dụng getters trả về kết quả của trường
    public double getBalance() {
        return this.balance;
    }

    public String getID() {
        return this.id;
    }

    public int getTransactions() {
        return transactions;
    }

    // TODO: Cộng tiền vào the balance nếu trong khoảng từ 0-500. Được tính là 1
    // transaction
    public void deposit(double amount) {
        if (amount >= 0 && amount <= 500) {
            balance += amount;
            transactions++;
        }
    }

    // TODO: Trừ tiền vào balance nếu như số dư còn. Được tính là 1 transaction
    public void withdraw(double amount) {
        if (balance > 0 && amount <= balance) {
            balance -= amount;
            transactions++;
        }
    }

    public void transactionFee(double amount) {
        int total = 0;
        boolean res = true;
        for (int i = 1; i <= transactions; i++) {
            total += amount * i;
        }
        balance -= total;
        if (balance < 0) {
            balance = 0.0;
            res = false;
        }
        System.out.println(res);
    }
}

public class Main {
    public static void main(String[] argr) {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // sc.nextLine();
        // while (t-- > 0) {
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // int w = sc.nextInt();
        // int h = sc.nextInt();
        // System.out.println(new Rectangle(x, y, w, h));
        // }
        // sc.close();
        BankAccount savings = new BankAccount("Jimmy");
        savings.deposit(10.00);
        savings.deposit(50.00);
        savings.deposit(10.00);
        savings.deposit(70.00);
        savings.transactionFee(5.00);
        savings.transactionFee(10.00);
    }
}