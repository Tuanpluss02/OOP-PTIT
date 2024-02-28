import java.util.Scanner;

class Point {
    int x, y;

    public double slope(Point other) {
        if (other.x == this.x)
            return -1;
        double res = (double) (other.y - this.y) / (other.x - this.x);
        return res == -0.0 ? 0.0 : res;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            Point p1 = new Point();
            Point p2 = new Point();
            p1.setX(sc.nextInt());
            p1.setY(sc.nextInt());
            p2.setX(sc.nextInt());
            p2.setY(sc.nextInt());
            // System.out.print(p1.x + " " + p1.y + " "+ p2.x + " " + p2.y);
            System.out.println(p1.slope(p2));
        }
    }
}
