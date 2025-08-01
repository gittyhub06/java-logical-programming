package leetcode;
import java.util.Scanner;
class DigitSum{
	int n;
	public void inputs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
	}
	public int sum(int num) {
		int sum=0;
		while(num!=0) {
			int ld=num%10;
			sum+=ld;
			num/=10;
		}
		System.out.println("The sum of the digits of "+n+" is "+sum);
		return sum;
	}
}

public class Sum_Of_Digits {
	public static void main(String[] args) {
		DigitSum d=new DigitSum();
		d.inputs();
		int sum=d.sum(d.n);
	}

}
