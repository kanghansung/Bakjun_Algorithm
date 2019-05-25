package May_Month;

import java.util.Scanner;

public class Bakjun5532 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int L = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		
		int countM = 0;
		int countK = 0;
		countM += A/C;
		if(A%C != 0)
			countM += 1;
		countK += B/D;
		if(B%D != 0)
			countK += 1;
		
		if(countM >= countK)
			System.out.println(L - countM);
		else
			System.out.println(L - countK);
	}

}
