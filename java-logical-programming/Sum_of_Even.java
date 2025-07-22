package leetcode;
import java.util.Scanner;
class SumE{
	int n;
	public void inputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
	}
	public void Sum(){
		int m;
		m=n*(n+1);
		System.out.println("The sum of first "+n+" even numbers is "+m);
	}
}

public class Sum_of_Even {
	public static void main(String[] args) {
		SumE s = new SumE();
		s.inputs();
		s.Sum();
	}
}
