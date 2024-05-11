import java.util.ArrayList;
import java.util.List;

class Item {
    private String name;
    private int weight;

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Item))
            return false;
        Item tmp = (Item) o;
        return (tmp.name == this.name);
    }

}

abstract class Box {
    abstract void add(Item item);

    abstract boolean isInBox(Item item);
}

class BoxWithMaxWeight extends Box {

    private List<Item> items = new ArrayList<>();
    private int maxWeight;

    public BoxWithMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    void add(Item item) {
        int totalWeight = 0;
        for (Item i : items)
            totalWeight += i.getWeight();
        if (totalWeight + item.getWeight() > maxWeight)
            return;
        items.add(item);
    }

    @Override
    boolean isInBox(Item item) {
        return items.contains(item);
    }

}

public class Main {
    public static void main(String[] a) {
        BoxWithMaxWeight box = new BoxWithMaxWeight(10);
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));
        box.add(new Item("Kopi Luwak", 5));
        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
        System.out.println(box.isInBox(new Item("Kopi Luwak")));
    }
}