import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(findLongestWord(s));
        }
        sc.close();

    }

    public static String findLongestWord(String sentence) {
        List<String> splitted = new ArrayList<>();
        splitted.addAll(Arrays.asList(sentence.split(" ")));
        String longtest = splitted.get(0);
        for (int i = 0; i < splitted.size(); i++) {
            longtest = (splitted.get(i).length() >= longtest.length() ? splitted.get(i) : longtest);
        }
        return longtest;
    }

}