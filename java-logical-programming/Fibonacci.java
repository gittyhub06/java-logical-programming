package leetcode;
import java.util.Scanner;
class Fibn{
	int n;
	public void inputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
	}
	public int fib(int num) {
		int f=0;
		int s=1;
		System.out.println("The Fibonacci sequence up to "+n+" is");
		System.out.print(" "+f);
	for(int i=0;i<=n;i++) {
		int k=f+s;
		f=s;
		s=k;
		System.out.print(" "+k);
		
	}
		return 0;
	}
}

public class Fibonacci {
	public static void main(String[] args) {
		Fibn f=new Fibn();
		f.inputs();
		f.fib(f.n);
	}

}
