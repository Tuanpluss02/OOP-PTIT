class Product {
    private String name, location;
    private int weight;

    public Product(String name) {
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }

    public Product(String name, String location) {
        this.name = name;
        this.location = location;
        this.weight = 1;
    }

    public Product(String name, int weight) {
        this.name = name;
        this.location = "shelf";
        this.weight = weight;
    }

    // tape measure (1kg) can be found from the shelf
    public void printProduct() {
        System.out.println(this.name + " (" + this.weight + "kg) can be found from the " + this.location);
    }
}

public class Main {
    public static void main(String[] args) {
        Product m1 = new Product("Tape measure");
        Product m2 = new Product("Plaster", "home improvement section");
        Product m3 = new Product("Tyre", 5);
        m1.printProduct();
        m2.printProduct();
        m3.printProduct();
    }
}
