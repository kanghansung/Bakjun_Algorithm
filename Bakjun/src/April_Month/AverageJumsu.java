package April_Month;

import java.util.Scanner;

public class AverageJumsu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		for(int i=0;i<5;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		for(int i=0;i<5;i++)
		{
			if(arr[i] <40)
				arr[i] = 40;
			sum += arr[i];
		}
		System.out.println(sum/5);
	}
}
