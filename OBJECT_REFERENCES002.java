class SimpleDate {
    int day, month, year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean equals(SimpleDate s) {
        if (this.day == s.day && this.month == s.month && this.year == s.year)
            return true;
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // sc.nextLine();
        // while (t-- > 0) {
        // String[] imp1 = sc.nextLine().split(" ");
        // String[] imp2 = sc.nextLine().split(" ");
        // Song s1 = new Song(imp1[0], imp1[1], Integer.parseInt(imp1[2]));
        // Song s2 = new Song(imp2[0], imp2[1], Integer.parseInt(imp2[2]));
        // System.out.println(s1.equals(s2));

        // }
        // sc.close();
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("alooo"));
        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
    }
}
