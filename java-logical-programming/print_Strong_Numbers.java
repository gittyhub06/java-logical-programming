package leetcode;
import java.util.Scanner;
class PrintStr{
	static int count=0;
	public static void inputs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int sum=strn(i);
			display(i,sum);
		}
		if(count==0) {
			System.out.println("There are no Strong Numbers between 1 to "+n);
		}
	}
	public static int fac(int num) {
		int f;
		if(num==0||num==1) {
			return 1;
		}
		f=num*(fac(num-1));
		return f;
	}
	public static int strn(int num) {
		int sum=0;
		while(num>0) {
			int ld=num%10;
			sum+=fac(ld);
			num/=10;
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

public class print_Strong_Numbers {
	public static void main(String[] args) {
		 PrintStr.inputs();
	}

}
