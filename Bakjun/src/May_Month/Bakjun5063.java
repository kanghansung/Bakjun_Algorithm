package May_Month;

import java.util.Scanner;

public class Bakjun5063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int arr[][] = new int[N][3];

		for(int i=0;i<N;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0;i<N;i++)
		{
			if(arr[i][1] > arr[i][0] + arr[i][2])
				System.out.println("advertise");
			else if(arr[i][1] == arr[i][0] + arr[i][2])
				System.out.println("does not matter");
			else
				System.out.println("do not advertise");
		}
		
		
	}

}
