import java.util.Scanner;

public class IsomorphicString {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		StringBuffer sb=new StringBuffer();
		int r1,r2,n;
		if(str1.length()!=str2.length())
		{
			System.out.println("false");
			System.exit(0);
		}
		for(int i=0;i<str1.length();i++)
		{
			for(int j=i;j<str1.length();j++)
			{
				if(str1.charAt(i)==str1.charAt(j))
					sb.append(j+1);
			}
			sb.append(' ');
		}
		System.out.println(sb);
		String position=sb.toString();
		String[] pos=position.split(" ");
		
		
		for(int i=0;i<str2.length();i++)
		{
			if(pos[i].length()<=1)
			{
				//System.out.println("one digit");
				continue;
			}
			
		n=Integer.parseInt(pos[i]);
		
		r1=n%10;
		n=n/10;
	
		while(n>0)
		{
			//System.out.println("check");
			r2=n%10;
			n=n/10;
			if(str2.charAt(r1-1)!=str2.charAt(r2-1))
					{	
						System.out.println("false");
						System.exit(0);	
					}
		}
		
		}
		
	System.out.println("true");
	sc.close();	
	}

}
