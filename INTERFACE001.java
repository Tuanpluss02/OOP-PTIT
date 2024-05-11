import java.util.ArrayList;
import java.util.List;

interface Packable {
    double weight();
}

class Book implements Packable {

    private String author;
    private String name;
    private double weight;

    public Book() {
    }

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return author + ": " + name;
    }

}

class CD implements Packable {

    private String artist;
    private String name;
    private int publicationYear;

    public CD() {
    }

    public CD(String artist, String name, int publicationYear) {
        this.artist = artist;
        this.name = name;
        this.publicationYear = publicationYear;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return artist + ": " + name + " (" + publicationYear + ")";
    }

}

public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // sc.nextLine();
        // while (t-- > 0) {

        // }
        // sc.close();
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        bookList.add(new Book("Robert Martin", "Clean Code", 1));
        bookList.add(new Book("Kent Beck", "Test Driven Development", 0.5));

        List<CD> CDList = new ArrayList<>();
        CDList.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        CDList.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        CDList.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        bookList.forEach(book -> {
            System.out.println(book);
        });

        CDList.forEach(cd -> {
            System.out.println(cd);

        });
    }

}