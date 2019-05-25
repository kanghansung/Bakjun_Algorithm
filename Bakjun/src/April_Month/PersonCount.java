package April_Month;

import java.util.Scanner;

public class PersonCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int o =0;
		int x =0;
		for(int i=0;i<N;i++)
		{
			switch(scan.nextInt())
			{
			case 1:
				o += 1;
				break;
			case 0:
				x += 1;
				break;
			}
		}
		if(o>x)
			System.out.println("Junhee is cute!");
		else
			System.out.println("Junhee is not cute!");

	}

}
