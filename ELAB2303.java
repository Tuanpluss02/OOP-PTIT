class MyStuff {
    private String name;

    MyStuff(String name) {
        this.name = name;
        // System.out.println("My Stuff is: " + name);
    }

    public boolean equals(MyStuff m) {
        return (m.name.equals(name));
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

        // b.
        System.out.print("reference compared: ");
        if (m2 == m1)
            System.out.println("same");
        else
            System.out.println("different");

    }
}
