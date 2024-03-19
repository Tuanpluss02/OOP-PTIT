import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class STACK001 {
    static void compressDuplicates(Stack<Integer> s) {
        List<Integer> res = new ArrayList<>();
        Integer count = 1;
        Integer prev = s.pop();
        while (!s.isEmpty()) {
            Integer curr = s.pop();
            if (curr == prev) {
                count++;
            } else {
                res.add(prev);
                res.add(count);

                count = 1;
                prev = curr;
            }
        }
        res.add(prev);
        res.add(count);
        for (int i = res.size() - 1; i >= 0; i--) {
            System.out.print(res.get(i) + (i == 0 ? "" : " "));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();
            while (n-- > 0) {
                String str = sc.nextLine();
                if (str.isEmpty()) {
                    System.out.println("\n");
                    continue;
                }
                String[] arr = str.split("\\s+");
                Stack<Integer> s = new Stack<>();
                for (String a : arr) {
                    s.push(Integer.parseInt(a));
                }
                compressDuplicates(s);
            }
            sc.close();
        } catch (Exception e) {
            // System.out.println(e);
        }
    }
}
