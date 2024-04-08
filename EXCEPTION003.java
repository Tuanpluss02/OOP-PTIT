import java.util.Scanner;

class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}

public class EXCEPTION003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String str = sc.nextLine();
            try {
                hasVowels(str);
            } catch (NoVowelsException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void hasVowels(String str) throws NoVowelsException {
        if (!str.matches(".*[aeiouAEIOU].*")) {
            throw new NoVowelsException("String not contain vowels");
        }
        System.out.println("String has vowels");
    }
}