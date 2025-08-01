package leetcode;
import java.util.Scanner;
class DigitProduct{
	int n;
	public void inputs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
	}
	public int product(int num) {
		int prod=1;
		while(num!=0) {
			int ld=num%10;
			prod*=ld;
			num/=10;
		}
		System.out.println("The product of the digits of "+n+" is "+prod);
		return prod;
	}
}

public class Product_Of_Digits {
	public static void main(String[] args) {
		DigitProduct d=new DigitProduct();
		d.inputs();
		int product=d.product(d.n);
	}

}
