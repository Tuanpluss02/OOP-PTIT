import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int test = sc.nextInt(), inp = 0, sum = 0;
		while(test-- > 0){
            sum = 0;
			List<Integer> a = new ArrayList<>();
			for(int i = 0;i < 5; i++)
			{
				inp = sc.nextInt();
				a.add(inp);
			}
			for (int x : a)
				sum+= x;
			System.out.println(sum);
		}
    }
}