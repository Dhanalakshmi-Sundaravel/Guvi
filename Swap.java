

import java.util.Scanner;

public class Swap {
	public static void main(String args[])
	{
		Scanner sc =new Scanner (System.in);
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		if(str.length()%2==0)
		{
			for(int i=0;i<str.length();i=i+2)
			{
				char temp;
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		else
		{
			for(int i=0;i<str.length()-1;i=i+2)
			{
				char temp;
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		for(int i=0;i<str.length();i++)
			System.out.print(arr[i]);
		
	}

}
