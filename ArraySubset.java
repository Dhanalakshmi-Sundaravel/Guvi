import java.util.Scanner;
public class ArraySubset {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int count=0;
		int[] a1=new int[n];
		int[] a2=new int[m];
		for(int i=0;i<n;i++)
			a1[i]=sc.nextInt();
		for(int i=0;i<m;i++)
			a2[i]=sc.nextInt();
		for(int i=0;i<a1.length;i++)
		{
		for (int j = 0; j < a2.length; j++) 
			{
				if(a1.length>a2.length)
				{
						System.out.println("a1 is not a subset of a2////");
						System.exit(0);
				}
				if(a1[i]==a2[j])
				{
					count++;
				}
			}
		
		}
		if(count==a1.length)
			System.out.println("a1 is a subset of a2");
		else
			System.out.println("a1 is not a subset of a2");
		sc.close();
	}
		

}
