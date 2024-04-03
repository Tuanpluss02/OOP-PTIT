class Person {
    private String name, address;

    @Override
    public String toString() {
        return name + " - " + address;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

}

class Student extends Person {
    private int credit = 0;

    public Student(String name, String address) {
        super(name, address);
    }

    int getCredit() {
        return credit;
    }

    void study() {
        this.credit++;
    }

}

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(student);
        System.out.println("Study credits " + student.getCredit());
        student.study();
        System.out.println("Study credits " + student.getCredit());
    }
}
