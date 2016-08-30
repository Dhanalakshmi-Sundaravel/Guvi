import java.util.Arrays;
import java.util.Scanner;

public class FindHeigth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] heigth=new int[50];
		for (int i = 0; i < heigth.length; i++) {
			heigth[i]=sc.nextInt();
		}
		System.out.println("enter k");
		int k=sc.nextInt();
		int l=heigth.length;
		Arrays.sort(heigth);
		System.out.println("4th tallest boy"+heigth[l-4]);
		
		System.out.println("kth tallest boy"+heigth[l-k]);
		sc.close();
	}

}
