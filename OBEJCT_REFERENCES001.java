import java.util.Scanner;

class Song {
    String name;
    String author;
    int duration;

    public Song(String name, String author, int duration) {
        this.name = name;
        this.author = author;
        this.duration = duration;
    }

    @Override
    public boolean equals(Object s) {
        if (s instanceof Song) {
            Song d = (Song) s;
            if (this.name.equals(d.name) && this.author.equals(d.author) && this.duration == d.duration) {
                return true;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String[] imp1 = sc.nextLine().split(" ");
            String[] imp2 = sc.nextLine().split(" ");
            Song s1 = new Song(imp1[0], imp1[1], Integer.parseInt(imp1[2]));
            Song s2 = new Song(imp2[0], imp2[1], Integer.parseInt(imp2[2]));
            System.out.println(s1.equals(s2));

        }
        sc.close();
    }
}
