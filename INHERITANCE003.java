class Item {
    private String name;
    private double price;
    private double discount;

    public Item(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    // item 1 $2.30 (-$0.00)
    @Override
    public String toString() {
        return name + " $" + String.format("%.2f", price) + " (-$" + String.format("%.2f", discount) + ")";
    }

}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
}

class GroceryBill {
    private Employee clerk;
    private Item[] receipt;
    private double total;

    public GroceryBill(Employee clerk) {
        this.clerk = clerk;
        this.receipt = new Item[0];
        this.total = 0.0;
    }

    public void add(Item i) {
        Item[] newReceipt = new Item[receipt.length + 1];
        System.arraycopy(receipt, 0, newReceipt, 0, receipt.length);
        newReceipt[newReceipt.length - 1] = i;
        receipt = newReceipt;
        total += i.getPrice();
    }

    public double getTotal() {
        return total;
    }

    public Employee getClerk() {
        return clerk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("items:\n");
        for (Item i : receipt) {
            sb.append("   ").append(i.toString()).append("\n");
        }
        sb.append("total: $").append(String.format("%.2f", total));
        return sb.toString();
    }

    public Item[] getReceipt() {
        return receipt;
    }
}

class DiscountBill extends GroceryBill {
    private double discountAmount;

    public DiscountBill(Employee clerk) {
        super(clerk);
    }

    @Override
    public void add(Item i) {
        super.add(i);
        this.discountAmount += i.getPrice() - i.getDiscount();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("items:\n");
        for (Item i : super.getReceipt()) {
            sb.append("   ").append(i.toString()).append("\n");
        }
        sb.append("sub-total: $").append(String.format("%.2f", super.getTotal())).append("\n");
        sb.append("discount: $").append(String.format("%.2f", super.getTotal() - discountAmount)).append("\n");
        sb.append("total: $").append(String.format("%.2f", discountAmount));
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Employee clerk1 = new Employee("Grocery Bill");
        GroceryBill bill = new GroceryBill(clerk1);
        bill.add(new Item("item 1", 2.30, 0.0));
        bill.add(new Item("item 2", 3.45, 0.0));
        System.out.println(bill);
        System.out.println("Clerk: " + bill.getClerk().getName() + "\n");

        Employee clerk2 = new Employee("Discount Bill");
        DiscountBill discountBill = new DiscountBill(clerk2);
        discountBill.add(new Item("item 3", 20, 15));
        discountBill.add(new Item("item 4", 40, 35));
        discountBill.add(new Item("item 5", 50, 35));
        System.out.println(discountBill);
        System.out.println("Clerk: " + discountBill.getClerk().getName());
    }
}
