package April_Month;

import java.util.Scanner;

public class NumberOfZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		scan.close();
		String num = A * B * C + "";
		String[] arr = new String[num.length()];

		int max = num.length();
		
		for(int i=0;i<max;i++)
		{
			String tmp = num.substring(num.length()-1, num.length());
			num = num.substring(0,num.length()-1);
			arr[i] = tmp;
		}
	
		int[] ans = {0,0,0,0,0,0,0,0,0,0};
		try 
		{
			for(int i=0;i<arr.length;i++)
			{
				ans[Integer.parseInt(arr[i])] += 1;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int j=0;j<10;j++)
		{
			System.out.println(ans[j]);
		}
		
	}
}
