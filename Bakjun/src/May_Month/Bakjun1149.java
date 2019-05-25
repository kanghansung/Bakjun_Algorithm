package May_Month;

import java.util.Scanner;

public class Bakjun1149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[][]= new int[N+1][3];
		boolean R, G, B = false;
		int sum = 0;
		int old = 5;
//		int index = 0;
		
		for(int i=1;i<N+1;i++)
		{
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
			arr[i][2] = scan.nextInt();
		}
		scan.close();
		
		
		for(int i=1;i<N+1;i++)
		{
			int index = whichIsMinIndex(arr[i][0], arr[i][1], arr[i][2]);
			int value = whichIsMinValue(arr[i][0], arr[i][1], arr[i][2], old);
			
			sum += value;
			old = index;
			
			System.out.println("sum : "+sum+", old : "+old+", value : "+value+", index :"+index);
		}
		
		System.out.println("총합 :"+sum);
	}
	
	static int whichIsMinValue(int a, int b, int c, int index)
	{
		int min = 0;
		switch(index)
		{
			case 0:
				System.out.println("case 0!");
				if(b>=c)
					return c;
				else
					return b;
				
			case 1:
				System.out.println("case 1!");
				if(a>=c)
					return c;
				else
					return a;
			case 2:
				System.out.println("case 2!");
				if(a>=b)
					return b;
				else
					return a;
			default:
				System.out.println("case D!");
				if(a>=b)
					min = b;
				else
					min = a;
				if(min >= c)
					min = c;
				return min;
		}		
	}
	
	static int whichIsMinIndex(int a, int b, int c)
	{
		int min;
		if(a >= b)
			min = b;
		else
			min = a;
		
		if(min >= c)
			min = c;
		
		if(min == a)
		{
			System.out.println("Return index 0");
			return 0;
		} else if(min == b) {
			System.out.println("Return index 1");
			return 1;
		}
		else {
			System.out.println("Return index 2");
			return 2;
		}
	}

}
