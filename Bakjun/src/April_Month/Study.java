package April_Month;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add(3);
		list.add(8);
		list.add(2);
		list.add(2);
		list.add(9);
		
		
		
		System.out.println("ArrayList");
		for(int i=0;i<list.size();i++)
		{
			System.out.println((i+1)+" : " +list.get(i));
		}
		
		System.out.println("HashSet");
		HashSet hash = new HashSet(list);
		
		print(list);
		print(hash);
		while(hash.iterator().hasNext())
		{
			System.out.println(hash.iterator().next());
			hash.remove(hash.iterator().next());
		}
		System.out.println("Collections로 정렬 하기 전 : "+list);
		Collections.sort(list);
		System.out.println("Collections로 정렬 하고  : "+list);
		
		
	}
	
	static void print(ArrayList list)
	{
		System.out.println(list);
	}
	static void print(HashSet hashset)
	{
		System.out.println(hashset);
	}
}
