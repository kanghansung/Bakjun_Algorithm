package May_Month;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bakjun5597 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int arr[] = new int[31];
		for(int i=0;i<31;i++)
			arr[i] = 0;
		
		for(int i=0;i<28;i++)
		{
			arr[scan.nextInt()] = 1;
		}
		for(int i=0;i<31;i++)
		{
			if(arr[i] == 0)
				list.add(i);
		}
		Ascending ascending = new Ascending();
		Collections.sort(list);
		
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		

	}

}

class Ascending implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
	
}
