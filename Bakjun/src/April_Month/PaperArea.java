package April_Month;

import java.util.Scanner;

public class PaperArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int valX[] = new int[count];
		int valY[] = new int[count];
		int arr[][] = new int[100][100];
		for(int i=0;i<100;i++)
		{
			for(int j=0;j<100;j++)
			{
				arr[i][j] = 0;
			}
		}
		
		
		for(int i=0;i<count;i++)
		{
			valX[i]= scan.nextInt();
			valY[i] = scan.nextInt();
		}
		scan.close();
		int ans = 0;
		for(int k=0;k<count;k++)
		{
			for(int i=valX[k];i<valX[k]+10;i++)
			{
				for(int j=valY[k];j<valY[k]+10;j++)
				{
					if(arr[i][j] == 0)
					{
						arr[i][j] = 1;
						ans += 1;
					}
				}
			}
		}
		
		System.out.println(ans);
	}

}
