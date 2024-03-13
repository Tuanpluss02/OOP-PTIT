import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int longestSortedSequence(List<Integer> array) {
        int maxDes = -1;
        int tmp = 1;
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i + 1) >= array.get(i)) {
                tmp++;
            } else {
                maxDes = Math.max(maxDes, tmp);
                tmp = 1;
            }
        }
        return Math.max(maxDes, tmp);

    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (s.isEmpty()) {
                System.out.println(0);
                continue;
            }
            List<Integer> list = new ArrayList<>();
            String[] arr = s.split(" ");
            for (String str : arr) {
                list.add(Integer.parseInt(str));
            }
            System.out.println(longestSortedSequence(list));
        }
        sc.close();

    }
}