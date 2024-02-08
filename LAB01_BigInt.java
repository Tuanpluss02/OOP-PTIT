import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0){
			String a = sc.next();
			char c = sc.next().charAt(0);
			String b = sc.next();
			BigInteger big1 = new BigInteger(a);
			BigInteger big2 = new BigInteger(b);
			switch(c){
			case '+':
				System.out.println(big1.add(big2));
				break;
			case '-':
				System.out.println(big1.subtract(big2));
				break;
			case '*':
				System.out.println(big1.multiply(big2));
				break;
			default:
				System.out.println(big1.divide(big2));
					
			}
			
		}
	}
}
