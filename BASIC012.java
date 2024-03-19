import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
<<<<<<< HEAD
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
=======

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
>>>>>>> eed6e8b01c59b267e61a287b86d9731f6e28368b

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test-- > 0) {
            String s = sc.nextLine();
            List<Integer> list = Arrays.stream(s.split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            int res = 0, tmp = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i + 1) >= list.get(i)) {
                    tmp++;
                } else {
                    res = Math.max(res, tmp);
                    tmp = 0;
                }
            }
            res = Math.max(res, tmp);
            System.out.println(res + 1);
        }
        sc.close();
    }
}
