package leetcode;
import java.util.Scanner;
class PFactors{
	int n;
	public void inputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
	}
	public boolean checkprime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		if(num==1) {
			return false;
		}
		return true;
	}
	public void pfactors() {
		System.out.println("The prime factors of "+n+" are:");
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				if(checkprime(i)) {
					System.out.println(i);
				}
			}
		}
	}
}

public class Prime_Factors {
	public static void main(String[] args) {
		PFactors f=new PFactors();
		f.inputs();
		f.pfactors();
	}

}
