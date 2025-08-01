package leetcode;
import java.util.Scanner;
class PerfectNumbers{
	static int count=0;
	public static void inputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println("Perfect numbers from 1 to "+n+" are");
		
		for(int i=1;i<=n;i++) {
			int sum = checkperf(i);
			display(i,sum);
		}
		if(count==0) {
			System.out.println("No perfect numbers found between 1 to "+n);
		}
	}
	public static int checkperf(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static void display(int n,int sum) {
		if(sum==n) {
			System.out.println(n);
			count++;
		}
	}
}

public class Print_Perfect_Numbers {
	public static void main(String[] args) {
		PerfectNumbers.inputs();
		
		
	}

}
