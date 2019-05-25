package April_Month;

import java.util.Scanner;

public class UtnolE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[12];
		for(int i=0;i<12;i++)
		{
			arr[i] = scan.nextInt();
		}
		scan.close();
		int[] ans = new int[3];
		for(int i=0;i<3;i++)
		{
			ans[i] = arr[4*i] + arr[4*i+1] + arr[4*i+2] + arr[4*i+3];
		}
		for(int i=0;i<3;i++)
		{
			System.out.println("ans["+i+"] : "+ans[i]);
			switch(ans[i])
			{
			case 4:
				System.out.println("E");
				break;
			case 3:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 1:
				System.out.println("C");
				break;
			case 0:
				System.out.println("D");
				break;
			} 
		}
	}
}
