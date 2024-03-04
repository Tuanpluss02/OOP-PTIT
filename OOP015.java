import java.util.Scanner;

class Person {
    String name, address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return name + " - " + address;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String name = sc.nextLine();
            String address = sc.nextLine();
            Person p = new Person(name, address);
            System.out.println(p);
        }
        sc.close();
    }
}
