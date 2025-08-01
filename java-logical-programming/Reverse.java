package leetcode;
import java.util.Scanner;
class CheckReverse{
	int n;
	public void inputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
	}
	public void reverse(int num) {
		int rev=0;
		while(num!=0) {
			int ld=num%10;
			rev=(rev*10)+ld;
			num/=10;
		}
		System.out.println("The reverse of "+n+" is "+rev);
	}
}

public class Reverse {
	public static void main(String[] args) {
		CheckReverse r= new CheckReverse();
		r.inputs();
		r.reverse(r.n);

   }
}
