package April_Month;

import java.util.Scanner;

public class Sibuje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int[] arr = new int[5];
		int count =0;
		for(int i=0;i<5;i++)
		{
			arr[i] = scan.nextInt();
			if(arr[i] == d)
				count++;
		}
		
		System.out.println(count);

	}

}
