package April_Month;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci_2 {
	
	static int zeros;
	static int ones;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int T;
		int num;

		T = scan.nextInt();
		ArrayList<Integer> testCase = new ArrayList<>();
		
		for(int i=0;i<T;i++)
		{
			num = scan.nextInt();
			testCase.add(num);
		}
		
		for(int i=0;i<T;i++)
		{
			num = testCase.get(i);
			
			fibonacci(num);
			
			System.out.println(zeros+" "+ones);
			
			zeros = 0;
			ones = 0;
		}
		
		scan.close();
	}
	
	
	public static int fibonacci(int n)
	{
		if(n == 0)
		{
//			System.out.print("0");
			zeros++;
			return 0;
		}
		if(n == 1)
		{
//			System.out.print("1");
			ones++;
			return 1;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
