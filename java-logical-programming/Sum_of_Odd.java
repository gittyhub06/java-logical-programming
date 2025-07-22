package leetcode;
import java.util.Scanner;
class SumO{
	int n;
	public void inputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
	}
	public void Sum(){
		int m;
		m=n*n;
		System.out.println("The sum of first "+n+" odd numbers is "+m);
	}
}

public class Sum_of_Odd {
	public static void main(String[] args) {
		SumO s = new SumO();
		s.inputs();
		s.Sum();
	}
}
