package May_Month;

import java.util.Scanner;

public class Bakjun2935 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String A = scan.next();
		String operation = scan.next();
		String B = scan.next();
		
		String ans = "";
		
		if(A.length() < B.length())
		{
			String temp = A;
			A = B;
			B = temp;
		}
		switch(operation)
		{
		case "*":
			for(int i=1;i<B.length();i++)
				A += "0";
			System.out.println(A);
			break;
		case "+":
			String p1 = A.substring(A.length()-B.length()+1);
			String p2 = A.substring(0, A.length()-B.length());
			if(A.length() == B.length())
			{
				ans += 2;
				for(int i=1;i<A.length();i++)
					ans += "0";
				System.out.println(ans);
				return;
			}
			System.out.println(p2+"1"+p1);
			break;
		}
	}
}
