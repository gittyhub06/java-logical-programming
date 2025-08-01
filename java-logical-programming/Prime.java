package leetcode;
import java.util.Scanner;
class Isprime{
	int n;
	public void inputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
	}
	public boolean check(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
			return false;
		}
	}
		if(n==1) {
			return false;
		}
		return true;
	}
	public void display() {
		if(check(n)) {
			System.out.println(n+" is a prime number");
		}else {
			System.out.println(n+" is not a prime number");
		}
	}
}

public class Prime {
	public static void main(String[] args) {
		Isprime p=new Isprime();
		p.inputs();
		p.display();
	}
}
