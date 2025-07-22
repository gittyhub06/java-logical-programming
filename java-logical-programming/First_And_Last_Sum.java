package leetcode;
import java.util.Scanner;
class Progress{
	int n,ld,fd;
	public void inputs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
	}
	public int extract(int num) {
		 ld=num%10;
		 fd=num;
		while(fd>=10) {
			fd=fd/10;
		}
		int sum=ld+fd;
		if(num<10) {
			sum=fd;
		}
		this.fd=fd;
		this.ld=ld;
		return sum;
	}
	public void display(int sum) {
		System.out.println("The Sum of the First and Last Digit of the number "+n+" is "+sum);
	}
}
public class First_And_Last_Sum {
	public static void main(String[] args) {
		Progress p = new Progress();
		p.inputs();
		int extract=p.extract(p.n);
		p.display(extract);
	}

}
