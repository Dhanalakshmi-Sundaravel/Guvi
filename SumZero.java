
import java.util.Scanner;

public class SumZero {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		for (int j = i; j < n; j++)
		{
			if(arr[i]+arr[j]==0)
			{
				System.out.println(arr[i]+" "+arr[j]);
			}
		}	
		}
		sc.close();
		}

}
