package April_Month;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int num = A;
		for(int i=1;i<B;i++)
		{
			System.out.println("i : "+i);
			A *= A;
		}
		System.out.println("A : "+A);
		System.out.println(Math.abs(A%C));

	}

}
