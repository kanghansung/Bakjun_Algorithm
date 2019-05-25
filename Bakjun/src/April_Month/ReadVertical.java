package April_Month;

import java.util.Scanner;

public class ReadVertical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String[] str = new String[5];
		String ans = "";
		for(int i=0;i<5;i++)
		{
			str[i] = scan.next();
		}
		while(!str[0].isEmpty()||!str[1].isEmpty()||!str[2].isEmpty()||!str[3].isEmpty()||!str[4].isEmpty())
		{
			if(!str[0].isEmpty())
			{
				ans += str[0].charAt(0);
				str[0] = str[0].substring(1);
			}
			if(!str[1].isEmpty())
			{
				ans += str[1].charAt(0);
				str[1] = str[1].substring(1);
			}
			if(!str[2].isEmpty())
			{
				ans += str[2].charAt(0);
				str[2]=str[2].substring(1);
			}
			if(!str[3].isEmpty())
			{
				ans += str[3].charAt(0);
				str[3]=str[3].substring(1);
			}
			if(!str[4].isEmpty())
			{
				ans += str[4].charAt(0);
				str[4]=str[4].substring(1);
			}
		}
		System.out.println(ans);
		
	}

}
