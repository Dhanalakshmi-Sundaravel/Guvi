import java.util.Scanner;
public class LongPrefix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String[] arr=new String[n+1];
	for(int i=0;i<n+1;i++)
		arr[i]=sc.nextLine();
	StringBuffer sb=new StringBuffer();
	for(int i=0;i<arr.length;i++)
	{
		for (int j = i+1; j < arr.length; j++) 
		{	
			
			for(int k=0;k<arr[i].length();k++)
			{
			if(arr[i].charAt(k)==arr[j].charAt(k))
			{
				sb.append(arr[i].charAt(k));
				
			}
			else
				break;
			}
			sb.append(" ");
		}
	}
	String str=sb.toString();
	String[] s=str.split(" ");
	int max=s[0].length();
	for(int i=1;i<s.length;i++)
	{
		if(max<s[i].length())
		{
			max=s[i].length();
		}
	}
	for (int j = 0; j < s.length; j++) {
		if(max==s[j].length())
		{
			System.out.println(s[j]);
			break;
		}
	}
	
	sc.close();
	
}
}
