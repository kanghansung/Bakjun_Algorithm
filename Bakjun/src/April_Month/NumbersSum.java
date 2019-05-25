package April_Month;

import java.util.Scanner;

public class NumbersSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sum = scan.nextInt();
		scan.close();
		
		int ans = 0;
		double val = Math.sqrt(sum);
		int num = (int)val;
		for(int i=num-5;i<num+10;i++)
		{
			int area = i*i+i;
			if(area > 2*sum)
			{
				ans = i-1;
				break;
			}
		}
		System.out.println(ans);
	}

}
