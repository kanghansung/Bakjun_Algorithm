package April_Month;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int[][] arr = new int[41][2];
		
		arr[0][0] = 1;
		arr[0][1] = 0;
		arr[1][1] = 1;
		arr[0][1] = 0;
		
		for(int i=2;i<41;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j] = arr[i-1][j] + arr[i-2][j];
			}
		}
		int[] test = new int[size];
		for(int i=0;i<size;i++)
		{
			int num = scan.nextInt();
			test[i] = num;
		}
		
		for(int a=0;a<size;a++)
		{
			System.out.println(arr[test[a]][0]+" "+arr[test[a]][1]);
		}

	}

	static int fibonacci(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
			
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
