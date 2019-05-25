package April_Month;

import java.util.Scanner;

public class LessThanX {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		int[] A = new int[N];
		int[] ans = new int[N];
		int count = 0;
		
		for(int i=0;i<N;i++)
		{
			A[i] = scan.nextInt();
		}
		
		for(int i=0;i<N;i++)
		{
			if(A[i] < X) {
				ans[count] = A[i];
				count++;
			}
		}
		
		for(int i=0;i<count;i++)
		{
			System.out.print(ans[i]+" ");
		}

	}
}
