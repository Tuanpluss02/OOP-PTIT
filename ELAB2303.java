import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class MyStuff {
    private String name;

    MyStuff(String name) {
        this.name = name;
        // System.out.println("My Stuff is: " + name);
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MyStuff myStuff = (MyStuff) o;
        return name.equals(myStuff.name);
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

        // b. Viết thêm code vào dấu ...
        System.out.print("reference compared: ");
        if (m2.hashCode() == m1.hashCode())
            System.out.println("same");
        else
            System.out.println("different");

    }
}
