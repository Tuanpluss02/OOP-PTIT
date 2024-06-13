import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String[] inp = sc.nextLine().split(" ");
            findIndex(inp);
        }
        sc.close();
    }

    public static void findIndex(String[] inp) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = Integer.parseInt(inp[0]);
        int tar = Integer.parseInt(inp[inp.length - 1]);
        for (int i = 1; i <= n; i++) {
            int x = Integer.parseInt(inp[i]);
            if (mp.containsKey(tar - x)) {
                System.out.println(Math.min(i - 1, mp.get(tar - x)) + " " + Math.max(i - 1, mp.get(tar - x)));
                return;
            }
            if (!mp.containsKey(x))
                mp.put(x, i - 1);
        }
        System.out.println("Not found");
    }
}
