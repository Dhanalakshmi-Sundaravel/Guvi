import java.util.Scanner;

public class StudentArrangement {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	
	for (int i = 1; i <= (2*n)-1; i++) 
	{
		System.out.println(i+"th day");
		int m=2*n;
		for (int j = 1; j <= (2*n); j++) 
		{	
			int f=j+i;
			if(f<=2*n)
			{
				
				System.out.println(j+"-->"+""+f);
			}
			else
			{	int b=(f-m);
				System.out.println(j+"-->"+""+b);
				
			}
		}
	
	}
	sc.close();
}
}
