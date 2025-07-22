package leetcode;
import java.util.Scanner;
class SumN{
	int n;
	public void inputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
	}
	public void Sum() {
		int m;
		m=(n*(n+1))/2;
		System.out.println("The sum of first "+n+" is "+m);
	}
}

public class Sum_of_Natural {
	public static void main(String[] args) {
		SumN s=new SumN();
		s.inputs();
		s.Sum();
	}

}
