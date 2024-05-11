import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(isPangram(s));
        }
        sc.close();
    }

    public static boolean isPangram(String sentence) {
        Set<Character> hashSet = new HashSet<>();
        List<Character> characterList = new ArrayList<>();
        for (char c : sentence.toCharArray()) {
            characterList.add(c);
        }
        hashSet.addAll(characterList);
        return hashSet.size() == 26;
    }

}