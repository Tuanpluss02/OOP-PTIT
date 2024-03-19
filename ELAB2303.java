<<<<<<< HEAD
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

=======
>>>>>>> eed6e8b01c59b267e61a287b86d9731f6e28368b
class MyStuff {
    private String name;

    MyStuff(String name) {
        this.name = name;
        // System.out.println("My Stuff is: " + name);
    }

<<<<<<< HEAD
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MyStuff myStuff = (MyStuff) o;
        return name.equals(myStuff.name);
=======
    public boolean equals(MyStuff m) {
        return (m.name.equals(name));
>>>>>>> eed6e8b01c59b267e61a287b86d9731f6e28368b
    }
}

public class Main {
    public static void main(String[] args) {
        MyStuff m1 = new MyStuff("PC");
        MyStuff m2 = new MyStuff("PC");

        // a.
        System.out.print("value compared: ");
        if (m2.equals(m1))
            System.out.println("same");
        else
            System.out.println("different");

<<<<<<< HEAD
        // b. Viết thêm code vào dấu ...
        System.out.print("reference compared: ");
        if (m2.hashCode() == m1.hashCode())
=======
        // b.
        System.out.print("reference compared: ");
        if (m2 == m1)
>>>>>>> eed6e8b01c59b267e61a287b86d9731f6e28368b
            System.out.println("same");
        else
            System.out.println("different");

    }
}
