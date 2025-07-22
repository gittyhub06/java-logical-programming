package leetcode;
import java.util.Scanner;
class  Condition{
	int n;
	int count;
	int ld,fd;
	public void inputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
	}
	public void count(int num) {
		int count=0;
		 if(num==0) {
			 return ;
		 }
			 while(num!=0) {
				 num=num/10;
				 count++;
			 } 
			 this.count=count;
	}
	
	public int extract(int num ){
		this.ld=num%10;
		int fd=(int) (num/(Math.pow(10 , (count-1))));
		return fd;
	}

	public void display( int sum) {
		System.out.println("The first digit of "+n+" is "+fd+" and the last digit is "+ld);
	}
}

public class First_And_Last {
	public static void main(String[] args) {
		Condition c = new Condition();
		c.inputs();
		c.count(c.n);
		int extract=c.extract(c.n);
		c.display(extract);
	}

}
  