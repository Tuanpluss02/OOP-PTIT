import java.util.Scanner;

abstract class Car {
    protected double price;
    protected int year;

    public Car(double price, int year) {
        this.price = price;
        this.year = year;
    }

    public abstract double calculateSalePrice();
}

class SportCar extends Car {

    public SportCar(double price, int year) {
        super(price, year);
    }

    @Override
    public double calculateSalePrice() {
        double salePrice = price;
        if (year > 2018) {
            salePrice *= 0.8;
        } else if (year > 2010) {
            salePrice *= 0.5;
        } else {
            salePrice *= 0.1;
        }
        return salePrice;
    }
}

class ClassicCar extends Car {

    public ClassicCar(double price, int year) {
        super(price, year);
    }

    @Override
    public double calculateSalePrice() {
        return price * 1.12 + 20000000;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        double maxSalePrice = 0;
        while (n-- > 0) {
            String inp = sc.nextLine();
            String lString[] = inp.split(" ");
            String type = lString[0];
            double price = Double.parseDouble(lString[1]);
            int year = Integer.parseInt(lString[2]);
            Car car = createCar(type, price, year);
            double salePrice = car.calculateSalePrice();
            maxSalePrice = Math.max(maxSalePrice, salePrice);
            System.out.printf("Price: %,.2f VND | Year: %d\n", salePrice, car.year);
        }
        System.out.printf("Most Expensive: %,.2f VND\n", maxSalePrice);
        sc.close();
    }

    private static Car createCar(String type, double price, int year) {
        if (type.equals("SC")) {
            return new SportCar(price, year);
        } else {
            return new ClassicCar(price, year);
        }
    }
}
