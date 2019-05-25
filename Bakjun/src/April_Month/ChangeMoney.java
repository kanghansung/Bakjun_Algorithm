package April_Month;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int change = 1000 - scan.nextInt();
		int count = 0;
		count += change/500;
		change %= 500;
		count += change/100;
		change %= 100;
		count += change/50;
		change %= 50;
		count += change/10;
		change %= 10;
		count += change/5;
		change %= 5;
		count += change;
		
		System.out.println(count);
	}

}
