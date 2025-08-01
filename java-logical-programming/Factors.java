package leetcode;
import java.util.Scanner;
class Calcf{
	int n;
	public void inputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
	}
	public void factor() {
		System.out.println("The factors of "+n+" are");
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
}

public class Factors {
	public static void main(String[] args) {
		Calcf f = new Calcf();
		f.inputs();
		f.factor();
	}

}
