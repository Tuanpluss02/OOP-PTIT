import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        if (y == "") {
            if (x == "")
                System.out.println(true);
            else
                System.out.println(false);
        } else {
            String yy = exportDigit(y);
            System.out.println(x.equals(yy));
        }
        sc.close();
    }

    public static String exportDigit(String s) {
        // if(s.equals("")) return null;
        String res = "";
        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c) || c == '-')
                res = res.concat("" + c);
        }
        return res;
    }

}
