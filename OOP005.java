import java.util.Scanner;

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double caculateArea();

    public void display() {
        // Shape:___|Area:___
        System.out.printf("Shape:%s|Area:%.2f\n", name, caculateArea());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double caculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double caculateArea() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            if (tokens[0].equals("Circle")) {
                Circle c = new Circle(tokens[0], Double.parseDouble(tokens[1]));
                c.display();
            } else {
                Rectangle r = new Rectangle(tokens[0], Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
                r.display();
            }
        }
    }
}