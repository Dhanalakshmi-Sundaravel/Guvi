import java.util.Scanner;

public class Repeated_nos_first {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int[] regno=new int[n];
		for(int i=0;i<n;i++)
			regno[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=i+1;j<n;j++)
			{
				if(regno[i]==regno[j])
				{
					count=1;
					break;
				}
			}
			if(count==1)
			{
			System.out.println(regno[i]);
			break;
			}
		}
		sc.close();
	}

}
