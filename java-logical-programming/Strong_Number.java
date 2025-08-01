package leetcode;
import java.util.Scanner;
class Calcu{
	int n,f;
	int sum=0;
	public void inputs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
	}
	public int fac(int num) {
		if(num==0||num==1) {
			return 1;
		}
		f=num*(fac(num-1));
		return f;
	}
	public int strn(int num) {
		int sum=0;
		while(num>0) {
			int ld=num%10;
			sum+=fac(ld);
			num/=10;
		}
		if(n==sum) {
		System.out.println(n+" is a Strong Number");
		}else {
			System.out.println(n+"is not a Strong Number");
		}
		return sum;
	}
}
public class Strong_Number {
	public static void main(String[] args) {
		Calcu s=new Calcu();
		s.inputs();
		s.strn(s.n);
	}
}
