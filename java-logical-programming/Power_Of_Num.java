package leetcode;
import java.util.Scanner;
class Exponent{
	int n,p;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		System.out.println("Enter the power");
		p=sc.nextInt();
	}
	public void power(int num) {
		int r=1;
		System.out.println(p);
		for(int i=1;i<=p;i++) {
			r*=num;
		}
		System.out.println(n+" power "+p+" is "+r);
	}
}

public class Power_Of_Num {
	public static void main(String[] args) {
		Exponent o=new Exponent();
		o.input();
		o.power(o.n);
	}

}
