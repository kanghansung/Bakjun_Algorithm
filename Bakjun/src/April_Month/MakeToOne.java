package April_Month;

import java.util.Scanner;

public class MakeToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[1000001];
		arr[1] = 0;
		

		int num =scan.nextInt();
		
		for(int i=2;i<num+1;i++)
		{
			arr[i] = arr[i-1] +1;
			
			if(i%2==0 && arr[i/2]+1 < arr[i])
				arr[i] = arr[i/2] +1;
			if(i%3==0 && arr[i/3]+1 < arr[i])
				arr[i] = arr[i/3];
				
		}
		System.out.print(arr[num]);

	}

}
