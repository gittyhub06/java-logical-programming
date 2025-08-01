package leetcode;
import java.util.Scanner;
class PerfectNum{
	int n;
	int sum=0;
	public void inputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
	}
	public int checkperf(int num) {
		for(int i=1;i<=n/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
	public void display() {
		if(sum==n) {
			System.out.println(n+" is a perfect number");
		}else {
			System.out.println(n+" is not a perfect number");
		}
	}
}

public class Perfect_Number {
	public static void main(String[] args) {
		PerfectNum p = new PerfectNum();
		p.inputs();
		p.checkperf(p.n);
		p.display();
	}
}
