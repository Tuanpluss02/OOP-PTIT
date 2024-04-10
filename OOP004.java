import java.util.Scanner;

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public Double distanceTo(Point p) {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String inp = sc.nextLine();
            String[] arr = inp.split(" ");
            Point p1 = new Point(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
            Point p2 = new Point(Integer.parseInt(arr[2]), Integer.parseInt(arr[3]));
            p1.move(1, 1);
            System.out.printf("%.2f\n", p1.distanceTo(p2));
        }
    }
}