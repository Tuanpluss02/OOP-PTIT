import java.util.ArrayList;
import java.util.Scanner;

class Point {
    private double x; // x co-ordinate
    private double y; // y co-ordinate
    private double z; // y co-ordinate

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point() {
    }

    public double getY() {
        return this.y;
    }

    public double getX() {
        return this.x;
    }

    public double getZ() {
        return this.z;
    }

}

class Line {
    private Point a;
    private Point b;

    public Line() {
    }

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Double distance() {
        return Math.sqrt(Math.pow(this.a.getX() - this.b.getX(), 2) + Math.pow(this.a.getY() - this.b.getY(), 2)
                + Math.pow(this.a.getZ() - this.b.getZ(), 2));
    }

}

class Pair {
    private String name;
    private Point point;

    public Pair(String name, Point point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return this.name;
    }

    public Point getPoint() {
        return this.point;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Pair pair = (Pair) obj;
        return this.name.equals(pair.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pair> points = new ArrayList<Pair>();
        Point startP = new Point();
        String startName = "";
        while (sc.hasNextLine()) {
            String name = sc.nextLine();
            if (sc.hasNextLine() == false) {
                if (!points.contains(new Pair(name, startP))) {
                    System.out.println("invalid input");
                    return;
                }
                startP = points.get(points.indexOf(new Pair(name, startP))).getPoint();
                startName = name;
                break;
            }
            String x = sc.nextLine();
            String[] xArr = x.split(" ");
            if (xArr.length != 3) {
                System.out.println("invalid input");
                return;
            }
            points.add(new Pair(name, new Point(Double.parseDouble(xArr[0]), Double.parseDouble(xArr[1]),
                    Double.parseDouble(xArr[2]))));
        }
        if (startName == "" || startP == null) {
            System.out.println("invalid input");
            return;
        }
        if (points.size() <= 1) {
            System.out.println("invalid input");
            return;
        }
        for (Pair pair : points) {
            String name = pair.getName();
            Point p = pair.getPoint();
            if (startName.equals(name)) {
                continue;
            }
            Double distance = new Line(startP, p).distance();
            if (distance == 0) {
                System.out.println("Line " + startName + name + ": same point");
            } else {
                System.out.printf("Line %s%s: %.2f\n", startName, name, distance);
            }
        }
        sc.close();

    }
}