import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

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
