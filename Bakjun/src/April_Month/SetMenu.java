package April_Month;

import java.util.Scanner;

public class SetMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int[] menu = new int[6];
		int index = 0;
		int min = 0;
		for(int i=0;i<5;i++)
		{
			arr[i] = scan.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=3;j<5;j++)
			{
				menu[index++] = arr[i] + arr[j] - 50;
			}
		}
		min = menu[0];
		for(int i=1;i<6;i++)
		{
			if(min > menu[i])
			{
				min = menu[i];
			}
		}
		
		System.out.println(min);
	}

}
