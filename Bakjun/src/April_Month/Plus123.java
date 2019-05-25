package April_Month;

import java.util.Scanner;

public class Plus123 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);						//입력 받을 객체 선
		int size = scan.nextInt();									//입력 받을 개수 받
		int[] values = new int[size];								//입력 받을 곳 생
		int[] ans = plus123(10);
		
		for(int i=0;i<size;i++)
		{
			values[i] = scan.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println(values[i]+" : "+ ans[values[i]]);
		}
		
	}
	
	static int abs(int n, int m)
	{
		if(n-m <0)
			return -(n-m);
		
		return n-m;
	}
	
	static int combination(int num)
	{
		int ans = 1;
		
		int num2 = num/2;
		int num3 = num/3;
		
		int count2 = 1;
		int count3 = 1;
		
		for(int i=1;i<=num2;i++)
		{
//			ans += fac(num-2*i+count2++) / fac(abs(num-2*i, i));
			ans += fac(num-2*i+count2++) / fac(i);
		}
		
		for(int i=1;i<=num3;i++)
		{
//			ans += fac(num-3*i+count3++) / fac(abs(num-3*i, i));
			ans += fac(num-3*i+count3++) / fac(i);
		}
		
		for(int i=1;i<=num2;i++)
		{
			for(int j=1;j<=num3;j++)
			{
				if(num2*i + num3*j == num)
				{
					ans += fac(i+j) / fac(i);
				}
			}
		}
		
		return ans;
	}
	static int fac(int num)
	{
		int ans =0;
		if(num ==0)
			return 1;
		if(num == 1)
			return 1;
		
		return num * fac(num-1);
	}
	
	static int[] plus123(int size) 
	{
		int[] ans = new int[size+1];
		
		ans[0] = 0;
		ans[1] = 1;
		ans[2] = 2;
		ans[3] = 4;
		
		for(int i=4;i<size+1;i++)
		{
			ans[i] = ans[i-1] + ans[i-2] + ans[i-3];
		}
		
		
		return ans;
		
	}
	
}
