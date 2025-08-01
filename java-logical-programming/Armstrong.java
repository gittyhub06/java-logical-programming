package leetcode;
import java.util.Scanner;
class CheckArm{
	int n;
	public void inputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
	}
	public int length(int num) {
		int length=0;
		while(num>0) {
			num/=10;
			length++;
		}
		return length;
	}
	public int power(int num,int p) {
		int e=1;
		for(int i=1;i<=p;i++) {
			e=e*num;
		}
		return e;
	}
	public void checkarm(int num) {
		int r=0;
		int l=length(num);
		while(num>0) {
			int ld=num%10;
			r=r+(int)power(ld,l);
			num=num/10;
		}
		System.out.println(r);
		if(n==r) {
			System.out.println(n+" is an Armstrong number");
		}else {
			System.out.println(n+" is not an Armstrong number");
		}
	}
}

public class Armstrong {
	public static void main(String[] args) {
		CheckArm a = new CheckArm();
		a.inputs();
		a.checkarm(a.n);
	}

}
