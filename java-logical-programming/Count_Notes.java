package leetcode;
import java.util.Scanner;
public class Count_Notes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount");
		int a = scanner.nextInt();
		int[] n = {2000,500,200,100,50,20,10,};
		System.out.println("Notes of "+a);
		for(int i=0;i<7;i=i+1) {
		 if(n[i]<a) {
			 int c = a/n[i];
			 System.out.println(n[i]+" = "+c);
			 a=a-(c*n[i]);
		 }
			
		}
	}

}
