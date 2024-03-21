
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void intrarest(Map<String, Integer> map) {
        Map<Integer, ArrayList<String>> temp = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (temp.containsKey(entry.getValue())) {
                temp.get(entry.getValue()).add(entry.getKey());
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(entry.getKey());
                temp.put(entry.getValue(), list);
            }
        }
        // for (Map.Entry<Integer, ArrayList<String>> entry : temp.entrySet()) {
        // System.out.print(entry.getKey() + " ");
        // for (String s : entry.getValue()) {
        // System.out.print(s + " ");
        // }
        // System.out.println();
        // }

        int minLength = Integer.MAX_VALUE;
        int minKey = Integer.MAX_VALUE;
        for (Map.Entry<Integer, ArrayList<String>> entry : temp.entrySet()) {
            if (entry.getValue().size() < minLength) {
                minLength = entry.getValue().size();
                minKey = entry.getKey();

            }
        }
        System.out.println(minKey);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i += 2) {
                map.put(arr[i], Integer.parseInt(arr[i + 1]));
            }
            intrarest(map);
        }
        sc.close();

    }
}
