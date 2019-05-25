package April_Month;

import java.util.ArrayList;
import java.util.Scanner;

public class DonotListenSee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		String a[] = new String[N];
		String b[] = new String[M];
		String ans[] = new String[N>M?M:N];
		int count = 0;
		String arr[] =new String[N+M];
		
		for(int i=0;i<N+M;i++)
		{
			arr[i] = scan.next();
		}
		for(int i=0;i<N;i++)
		{
			a[i] = arr[i];
		}
		for(int i=N+1;i<N+M;i++)
		{
			b[i-(N+1)] = arr[i]; 
		}
		for(int i=0;i<N;i++)
		{
			String tmp = a[i];
			int j=0;
			while(j<M)
			{
				System.out.println("i : "+i+", j : "+j+", tmp ->"+tmp);
				if(tmp.equals(b[j]))
				{
					ans[count] = new String(tmp);		
					count += 1;
				}
				j++;
			}
		}
		System.out.println(count);
		isSort(ans);
		for(int i=0;i<ans.length;i++)
		{
			if(ans[i] == null)
				break;
			System.out.println(ans[i]);
		}
	}
	
	static void isSort(String[] arr)
	{
		if(arr.length == 1)
			return ;
		for(int i=1;i<arr.length;i++)
		{
			if(isBig(arr[i-1].charAt(0),arr[i].charAt(0)))
				swap(arr[i-1], arr[i]);
		}
	}
	static void swap(String a, String b)
	{
		String tmp = a;
		a = b;
		b = tmp;
	}
	static boolean isBig(char a, char b)
	{
		if(a>b)
			return true;
		else 
			return false;
	}

}
