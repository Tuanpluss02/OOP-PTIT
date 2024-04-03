import java.util.ArrayList;
import java.util.Scanner;

interface Moveable {
    public void move(int dx, int dy);
}

class Organism implements Moveable {
    private int x, y;

    public Organism() {
        x = 0;
        y = 0;
    }

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // toString():hiển thị theo format:x:___;y:___
    @Override
    public String toString() {
        return "x:" + x + ";y:" + y;
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}

class Herd {
    private ArrayList<Organism> organisms;

    public void move(int dx, int dy) {
        for (Organism organism : organisms) {
            organism.move(dx, dy);
        }
    }

    public void addToHerd(Moveable moveable) {
        if (organisms == null) {
            organisms = new ArrayList<>();
        }
        organisms.add((Organism) moveable);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Organism organism : organisms) {
            result.append(organism.toString()).append("\n");
        }
        return result.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Herd herd = new Herd();
        while (t-- > 0) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            Organism organism = new Organism(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
            herd.addToHerd(organism);
        }
        herd.move(1, 1);
        System.out.println(herd);
        sc.close();
    }
}