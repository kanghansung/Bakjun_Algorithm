package April_Month;

import java.util.ArrayList;
import java.util.Scanner;

public class BertrangGonjun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		int ans = 0;
		
		while(true)
		{
			int n = scan.nextInt();
			if(n == 0)
				break;
			arr.add(n);
		}
		scan.close();
		int size = arr.size();
		int index =0;
		while(index < size)
		{
			int num = arr.get(index);
			for(int i=2*num;i>num;i--)
			{
				if(isSosu(i))
					ans+=1;
			}
			System.out.println(ans);
			ans = 0;
			index += 1;
		}
	}
	static boolean isSosu(int num)
	{
		if(num == 0)
			return false;
		int limit = (int)Math.sqrt(num);
		for(int i=2;i<=limit;i++)
		{
			if(num%i == 0)
				return false;
		}
		
		return true;
	}
}
