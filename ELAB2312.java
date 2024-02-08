import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (str.isEmpty()) break;
            int count = 0;
        	Pattern pattern = Pattern.compile("\\d");
        	Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
            count++;
        	}
            System.out.println(count);
        }
    }
}