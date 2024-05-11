
/**
 * Taco
 */
interface TacoBox {
    int tacoRemaining();

    void eat();
}

class TripleTacoBox implements TacoBox {
    private int tacos;

    public TripleTacoBox() {
        this.tacos = 3;
    }

    @Override
    public int tacoRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        if (tacos >= 1)
            tacos--;
    }

}

class CustomTacoBox implements TacoBox {
    private int tacos;

    public CustomTacoBox(int initialTacos) {
        this.tacos = initialTacos;
    }

    @Override
    public int tacoRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        if (tacos >= 1)
            tacos--;
    }

}

public class Main {
    public static void main(String[] a) {
        TripleTacoBox triple = new TripleTacoBox();
        triple.eat();
        triple.eat();
        System.out.println("Triple taco boxes left: " + triple.tacoRemaining());

        CustomTacoBox customTacoBox = new CustomTacoBox(8);
        customTacoBox.eat();
        System.out.println("Custom taco boxes left: " + customTacoBox.tacoRemaining());
    }
}