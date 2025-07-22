package leetcode;
import java.util.Scanner;
class Digit{
	int n;
	
	public void inputs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
	}
	public int count(int num) {
		int count=0;
		 if(num==0) {
			 return 1;
		 }
			 while(num!=0) {
				 num=num/10;
				 count++;
			 } 
			 return count;
		 
	}
	
	public void display(int count) {
		System.out.println("No of Digits in "+n+" is "+count);
	}
}

public class Digit_Count {
	public static void main(String[] args) {
		Digit d=new Digit();
		d.inputs();
		int count = d.count(d.n);
		d.display(count);
	}

}
