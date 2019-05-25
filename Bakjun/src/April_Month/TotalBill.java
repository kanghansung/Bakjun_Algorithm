package April_Month;

import java.util.Scanner;

public class TotalBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();
		int sum = 0;
		for(int i=0;i<9;i++)
		{
			sum += scan.nextInt();
		}
		System.out.println(total-sum);
	}

}
