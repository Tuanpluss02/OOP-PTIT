import java.util.Scanner;

public class Main {
    static class Final {
        static void f(boolean[] a, String[] b, Integer c) {
            System.out.println(b[0]);
            a[0] = true;
            c = c + 1;
            System.out.println(a[0]);
            System.out.println(c);
        }

        static void f(int d, char e, StringBuffer f) {
            System.out.println(d);
            d = d + (int) e;
            System.out.println(f);
        }

        static void f(double g, byte i, Float h) {
            g = g + h;
            System.out.println(i + g);
        }
    }

    public static void main(String[] args) {
        int a = 10;
        double b = 3.14;
        char c = 'c';
        String[] d = { "OOP", "2023" };
        Integer e = 1;
        boolean[] f = { false, true };
        StringBuffer g = new StringBuffer("Khoa Vien Thong");
        byte h = 20;
        Float i = 0.5f;

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        if (arr[2].equals("e")) {
            Final.f(f, d, e);
        } else if (arr[2].equals("a")) {
            Final.f(f, d, a);
        } else if (arr[2].equals("g")) {
            if (arr[1].equals("e")) {
                Final.f(e, c, g);
            } else {
                Final.f(a, c, g);
            }
        } else {
            Final.f(b, h, i);
        }
        sc.close();
    }
}