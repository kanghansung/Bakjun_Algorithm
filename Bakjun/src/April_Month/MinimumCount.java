package April_Month;

import java.util.Scanner;

public class MinimumCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int min = 10000000;
		int count5 =0;
		int count3= 0;
		
		count5 = N/5;
		count3 = N/3;
		
		int ans5 = 0;
		int ans3 = 0;
		boolean ans = false;
		for(int i=0;i<=count5;i++)
		{
			for(int j=0;j<=count3;j++)
			{
				if(5*i + 3*j == N)
				{
					ans5 = i;
					ans3 = j;
					if(min > i+j)
					{
						min = i+j;
						ans = true;
					}
				}
			}
		}
		
		if(ans)
		{
			System.out.println(ans5 + ans3);
		} else {
			System.out.print(-1);
		}
		
	}
}