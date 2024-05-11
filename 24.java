import java.util.Scanner;

class Pair {
    private int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int add() {
        return x + y;
    }

    public int substract() {
        return x - y;

    }

    public int divide() {
        return (y == 0 ? -1 : x / y);
    }

    @Override
    public String toString() {
        return "" + add() + " " + substract() + " " + divide();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Pair p = new Pair(x, y);
            System.out.println(p);
        }
        sc.close();
    }

}