import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    static int numberOfStudent;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfStudent++;
    }

    public void display() {
        if (age >= 18) {
            System.out.println(name);
        }
    }

}

public class Main {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        try {
            while (sc.hasNextLine()) {
                String name = sc.nextLine();
                String tmp = sc.nextLine();
                int age = Integer.parseInt(tmp);
                students.add(new Student(name, age));
            }
        } catch (Exception e) {
        }
        for (Student student : students) {
            student.display();
        }
        System.out.println(Student.numberOfStudent);
        sc.close();
    }
}
