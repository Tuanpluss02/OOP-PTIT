import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Account {
    String id;
    String name;
    long balance;
    static int nextId;

    String getNextId() {
        String res = "";
        if (nextId == 0)
            nextId++;
        if (nextId < 10) {
            res = "00" + Integer.toString(nextId);
        } else if (nextId < 100)
            res = "0" + Integer.toString(nextId);
        else
            res = Integer.toString(nextId);
        nextId++;
        return res;
    }

    Account(String name, long balance) {
        this.id = getNextId();
        this.name = name;
        this.balance = balance;
    }

    public String toString() {
        return "[" + this.id + ", " + this.name + ", " + this.balance + "]";
    }

    public void deposit(long amount) {
        this.balance += amount;
    }

    public void withdraw(long amount) {
        this.balance -= amount;
    }

}

class Utils {
    public static Account findAccountById(List<Account> accounts, String id) {
        int idNeedFind = Integer.parseInt(id);
        for (Account account : accounts) {
            int accId = Integer.parseInt(account.id);
            if (accId == idNeedFind) {
                return account;
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            List<Account> accounts = new ArrayList<>();
            sc.nextInt();
            String inputAcc = sc.nextLine();
            Pattern pattern = Pattern.compile("\\s*([\\p{L}\\s]+?)\\s+(\\d+)\\s*");
            Matcher matcher = pattern.matcher(inputAcc);
            while (matcher.find()) {
                String name = matcher.group(1).replaceAll("\\s+", " ");
                long balance = Integer.parseInt(matcher.group(2));
                accounts.add(new Account(name, balance));
            }
            String inputOp = sc.nextLine();
            List<String> list = new ArrayList<>();
            list = Arrays.asList(inputOp.split("\\s+"));
            int index = 0;
            int operator = Integer.parseInt(list.get(index++));
            for (int i = 0; i < operator; i++) {
                String op = list.get(index++).toLowerCase();
                // System.out.println(op);
                if (op.equals("rut")) {
                    String id = list.get(index++);
                    long amount = Long.parseLong(list.get(index++));
                    Account account = Utils.findAccountById(accounts, id);
                    if (account != null && account.balance >= amount && amount >= 0) {
                        account.withdraw(amount);
                    }
                } else if (op.equals("chuyen")) {
                    String id1 = list.get(index++);
                    String id2 = list.get(index++);
                    long amount = Long.parseLong(list.get(index++));
                    Account account1 = Utils.findAccountById(accounts, id1);
                    Account account2 = Utils.findAccountById(accounts, id2);
                    if (account1 != null && account2 != null && account1.balance >= amount) {
                        account1.withdraw(amount);
                        account2.deposit(amount);
                    }
                } else if (op.equals("nap")) {
                    String id = list.get(index++);
                    long amount = Long.parseLong(list.get(index++));
                    Account account = Utils.findAccountById(accounts, id);
                    if (account != null && amount >= 0) {
                        account.deposit(amount);
                    }
                } else {
                    // System.out.println("invalid input");
                    index += 3;
                }

            }
            for (Account account : accounts) {
                System.out.print(account.toString());
            }
            System.out.println();
            Account.nextId = 0;
        }
        sc.close();
    }
}