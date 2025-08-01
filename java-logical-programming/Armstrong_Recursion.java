package leetcode;
import java.util.Scanner;
class RecurArm{
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
		if(p==0) {
			return 1;
		}
		return num*power(num,p-1);
	}
	public void recurarm(int num) {
		int r=0;
		int l=length(num);
		while(num>0) {
			int ld=num%10;
			r=r+(int)power(ld,l);
			num/=10;
		}
	}
}

public class Armstrong_Recursion {
	public static void main(String[] args) {
		RecurArm r=new RecurArm();
		r.inputs();
	

	}

}
