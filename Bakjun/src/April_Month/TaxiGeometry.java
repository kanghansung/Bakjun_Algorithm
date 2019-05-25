package April_Month;

import java.util.Scanner;

public class TaxiGeometry {

	static double PI = 3.14159265358979323846264338327950288;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		double ans = 2*r * 2*r *1/2;
		System.out.println(String.format("%.6f", r*r*PI));
		System.out.println(String.format("%.6f", ans));

	}

}
