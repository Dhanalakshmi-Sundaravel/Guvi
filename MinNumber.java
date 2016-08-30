import java.util.Arrays;
import java.util.Scanner;
public class MinNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[10];
	int i=0;
	while(n!=0)
	{	
		
		arr[i]=n%10;
		n=n/10;
		i++;
	}
	int m=i;
	int[] arr2=new int[m];
	for (int j = 0; j < m; j++) 
	{
		arr2[j]=arr[j];
	}
	Arrays.sort(arr2);
		
	int d=sc.nextInt();
	int f=m-d;
			
	for (int j = 0; j < f; j++) 
	{
	System.out.print(arr2[j]);
	}
		
	}
}
