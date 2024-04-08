import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws InvalidNameException, InvalidAgeException {
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new InvalidNameException("Name is not valid");
        }
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age is not valid");
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        //Name: VDO--Age:38
        return "Name: " + name + "--Age:" + age;
    }
}

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class EXCEPTION004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String name = sc.nextLine();
            String age = sc.nextLine();
            try {
                int ageInt = Integer.parseInt(age);
                Person person = new Person(name, ageInt);
                System.out.println(person);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}
