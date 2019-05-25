package April_Month;

import java.util.Scanner;

public class TestGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int jum = scan.nextInt();
		
		if(jum >= 90)
		{
			System.out.println("A");
		} else if(jum <90 && jum >=80){
			System.out.println("B");
		} else if(jum < 80 && jum >=70)
		{
			System.out.println("C");
		} else if(jum < 70 && jum>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
