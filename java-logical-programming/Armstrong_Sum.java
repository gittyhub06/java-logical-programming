package leetcode;
import java.util.Scanner;
class CheckArmSum{
	public static void inputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println("The sum of Armstrong numbers from 1 to "+n+" is");
		for(int i=1;i<=n;i++) {
			   int  r=checkarm(i);
			   dispay(i,r);
		}
	}
	public static int length(int num) {
		int length=0;
		while(num>0) {
			num/=10;
			length++;
		}
		return length;
	}
	public static int power(int num,int p) {
		int e=1;
		for(int i=1;i<=p;i++) {
			e=e*num;
		}
		return e;
	}
	public static void checkarm(int num) {
		int r=0;
		int l=length(num);
		while(num>0) {
			int ld=num%10;
			r=r+(int)power(ld,l);
			num=num/10;
		}
	}
	public static void display(int n,int r) {
		int sum=0;
		if(n==r) {
			System.out.println(n);
		}
	}
}

public class Armstrong_Sum {
	public static void main(String[] args) {
		CheckArmSum.inputs();
	}

}
