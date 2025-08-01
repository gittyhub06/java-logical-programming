package leetcode;
import java.util.Scanner;
class Calculate{
	int n;
	int f;
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
		System.out.println("The factorial of "+num+"! is "+f);
		return f;
	}
}
public class Factorial {
	public static void main(String[] args) {
		Calculate k=new Calculate();
		k.inputs();
		k.fac(k.n);
//		k.display();
	}

}
