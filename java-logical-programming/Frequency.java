package leetcode;
import java.util.Scanner;
class Checkfreq{
	int n,d;
	public void inputs() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		System.out.println("Enter the digit to calculate the frequency");
		d=sc.nextInt();
	}
	public int cal(int num) {
		int count=0;
		while(num>0) {
			int ld=num%10;
			if(ld==d) {
				count++;
			}
			num/=10;
		}
		System.out.println("The frequency of "+d+" in "+n+" is "+count);
		return count;
	}
}
public class Frequency {
	public static void main(String[] args) {
		Checkfreq f=new Checkfreq();
		f.inputs();
		int cal=f.cal(f.n);
	}

}
