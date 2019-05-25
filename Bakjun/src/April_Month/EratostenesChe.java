package April_Month;

import java.util.Scanner;

public class EratostenesChe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		scan.close();
		int count = 0;
		int[] arr= new int [N+1];
		arr[0] = 0;
		arr[1] = 0;
		for(int i=2;i<=N;i++)
		{
			arr[i] = i;
		}

		
		int P = 0;
		int num = 0;
		while(count <= K)
		{
			for(int i=0;i<=N;i++)
			{
				if(arr[i] != 0)
				{
					P = arr[i];
					num = P;
					break;
				}
			}
			while(P <= N)
			{
				if(arr[P] != 0)
				{
					count += 1;
					arr[P] = 0;
				}
//				System.out.println("count -> "+count+", P ->"+P+", arr["+P+"] -> "+arr[P]+", K ->"+K);
				if(count == K)
				{
					System.out.println(arr[P]);
				}
				
				P += num;
			}
		}
	}
}
