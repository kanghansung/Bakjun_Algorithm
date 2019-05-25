package April_Month;

import java.util.Scanner;

public class Year2007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		int day = scan.nextInt();
		
		int countM = 0;
		int countD = 0;
		int total = 0;
		
		while(month != 1)
		{
			month -= 1;
			switch(month)
			{
				case 2:
					total += 28;
					break;
				case 1: case 3: case 5: case 7:case 8: case 10: case 12:
					total += 31;
					break;
				case 4: case 6: case 9: case 11:
					total += 30;
					break;
			}
			
		}
		for(int i=day;i>1;i--)
		{
			total += 1;
		}
		
		total = total%7;
		switch(total)
		{
		case 0:
			System.out.println("MON");
			break;
		case 1:
			System.out.println("TUE");
			break;
		case 2:
			System.out.println("WED");
			break;
		case 3:
			System.out.println("THU");
			break;
		case 4:
			System.out.println("FRI");
			break;
		case 5:
			System.out.println("SAT");
			break;
		case 6:
			System.out.println("SUN");
			break;
		}

	}
}
