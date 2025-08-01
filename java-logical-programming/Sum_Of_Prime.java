package leetcode;
import java.util.Scanner;
class Sump{
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
	public void displaysum() {
		int sum=0;
			for(int i=2;i<=n;i++) {
				if(checkprime(i)) {
					sum+=i;
				}
			}
		System.out.println("Sum of prime numbers betwwen 1 and "+n+" is "+sum);
	}
}

public class Sum_Of_Prime {
	public static void main(String[] args) {
		Sump s=new Sump();
		s.inputs();
		s.displaysum();
	}

}
