package April_Month;

import java.util.Scanner;

public class SerialNumber {
	static String[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		arr = new String[N];
		
		for(int i=0;i<N;i++)
		{
			String str = scan.nextLine();
			arr[i] = str;
		}
		
		
		for(int i=1;i<N;i++)
		{
			boolean check = true;
			if(arr[i-1].length() > arr[i].length() && check)
			{
				swap(arr[i-1], arr[i]);
				check = false;
			}
			
			if(check)
			{
				int a =0;
				for(int j=0;j<arr[i-1].length();j++)
				{
//					0<=Integer.parseInt(arr[i-1].charAt(j)+"") && Integer.parseInt(arr[i-1].charAt(j)+"")<=9
					if(isInteger(arr[i-1].charAt(j)+""))
						a += Integer.parseInt(arr[i-1].charAt(j)+"");
				}
				int b =0;
				for(int j=0;j<arr[i].length();j++)
				{
//					0<=Integer.parseInt(arr[i].charAt(j)+"") && Integer.parseInt(arr[i].charAt(j)+"")<=9
					if(isInteger(arr[i].charAt(j)+""))
						b += Integer.parseInt(arr[i].charAt(j)+"");
				}
				if(a > b)
				{
					swap(arr[i-1], arr[i]);
					check = false;
				}
			}
			
			if(check)
			{
				int a =0;
				for(int j=0;j<arr[i-1].length();j++)
				{
//					0<=Integer.parseInt(arr[i-1].charAt(j)+"") && Integer.parseInt(arr[i-1].charAt(j)+"")<=9
					if(isInteger(arr[i-1].charAt(j)+""))
					{
						a = j;
						break;
					}
				}
				int b =0;
				for(int j=0;j<arr[i].length();j++)
				{
//					0<=Integer.parseInt(arr[i].charAt(j)+"") && Integer.parseInt(arr[i].charAt(j)+"")<=9
					if(isInteger(arr[i].charAt(j)+""))
					{
						b = j;
						break;
					}
				}
				if(a > b)
				{
					swap(arr[i-1], arr[i]);
					check = false;
				}
			}
		}
		for(int i=0;i<N;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	static void swap(String a, String b)
	{
		String tmp = a;
		a = b;
		b= a;
	}
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    return true;
	}
}
