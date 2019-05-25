package April_Month;

import java.util.Scanner;

public class HongProgrammingContest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N];
		int num_team3 = 0;
		int num_team2 = 0;
		int num_person = 0;
		for(int i=0;i<N;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		for(int i=0;i<N;i++)
		{
			if(arr[i] % 3 == 0)
			{
				num_team3 += 1;
			}
			if(arr[i] % 2 == 0)
			{
				num_team2 += 1;
			}
		}
		
		if(num_team3 < 2 && num_team2 < 2)
		{
			System.out.println(N);
		} else {
			System.out.println(num_team3 >= num_team2 ? 3 * num_team3 : 2 * num_team2);
		}

	}

}
