package May_Month;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Bakjun2822 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> map = new HashMap();
		int total = 0;
		
		for(int i=1;i<9;i++)
		{
			map.put(i+"", scan.nextInt());
		}
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>(map);
		Iterator<Integer> iteratorValue = tm.entrySet()
		
		
	}

}
