package May_Month;

import java.util.Scanner;

public class Bakjun2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		int min = scan.nextInt();
		
		if(min - 45 < 0)
		{
			if(hour!=0)
			{
				hour -= 1;
				min = min + 15;
			} else {
				hour = 23;
				min = min + 15;
			}
		} else {
			min -= 45;
		}
		
		System.out.println(hour +" "+ min);
	}

}
