
import java.util.Scanner;

public class UniqueTwice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0,once=0;
		int[] regno=new int[n];
		for(int i=0;i<n;i++)
			regno[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=0;j<n;j++)
			{	
				if(regno[i]==regno[j]&&j!=i)
				{
					count=1;
					
				}
			}
			if(count!=1)
			{	
				if(once<1)
				{
				System.out.println(regno[i]);
				once++;
				}
				else 
					System.out.println("more than one unique");
			}
			
			
		}
		sc.close();
	}

}
