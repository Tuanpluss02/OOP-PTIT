import java.util.HashMap;

class Warehouse {
    private HashMap<String, Integer> hs = new HashMap<>();

    public void addProduct(String product, int stock) {
        hs.put(product, stock);
    }

    public int stock(String product) {
        if (hs.containsKey(product))
            return hs.get(product);
        return -99;
    }

}

public class Main {
    public static void main(String[] argr) {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // sc.nextLine();
        // while (t-- > 0) {
        Warehouse wh = new Warehouse();
        wh.addProduct("milk", 10);
        wh.addProduct("coffee", 7);
        System.out.println("prices:");
        System.out.println("milk: " + wh.stock("milk"));
        System.out.println("coffee: " + wh.stock("coffee"));
        System.out.println("sugar: " + wh.stock("sugar"));
        // }
        // sc.close();
    }
}